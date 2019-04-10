package com.sesung.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sa = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		ServerInfo si = new ServerInfo();

		try {
			System.out.println("Server : Client 접속받을 준비 중");
			ss = new ServerSocket(8180);
			sa = ss.accept();
			System.out.println("Server : 연결 성공");
			boolean check = true;
			while(check) {
				check = si.receiveClient(sa, is, ir, br);
				if(!check) {
					break;
				}
				check= si.sendClient(sa, os, ow, bw, sc);
				if(!check) {
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				sc.close();
				ss.close();
			} catch (Exception e) {
//				e.printStackTrace();
			}
		}
		//		System.out.println();
	}

}
