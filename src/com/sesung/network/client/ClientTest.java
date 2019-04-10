package com.sesung.network.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {
	public static void main(String[] args) {
		Socket s = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		ClientInfo ci = new ClientInfo();

		try {
			s = new Socket("211.238.142.23", 8180);
			System.out.println("서버와 접속 성공");
			boolean check = true;
			while(check) {
				check = ci.sendServer(s, os, ow, bw, sc);
				if(!check) {
					break;
				}
				check = ci.receiveServer(s, is, ir, br);
				if(!check) {
					break;
				}
	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				s.close();
			} catch (Exception e) {
//				e.printStackTrace();
			}
		}
		System.out.println("Client 종료");
	}


}
