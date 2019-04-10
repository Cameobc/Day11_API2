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

public class ServerInfo {

	public boolean sendClient(Socket sa, OutputStream os, OutputStreamWriter ow, BufferedWriter bw, Scanner sc) throws Exception {
		os = sa.getOutputStream();
		ow = new  OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		System.out.println("전송할 메세지를 입력하세요");
		String str = sc.next();
		bw.write(str);
		bw.write("\r\n");
		bw.flush();
		boolean check=true;
		if(str.equals("end")) {
			check=!check;
		}
		return check;
	}

	public boolean receiveClient(Socket sa, InputStream is, InputStreamReader ir, BufferedReader br) throws Exception {
		is = sa.getInputStream();	//byte 처리
		ir = new InputStreamReader(is); //char  처리
		br = new BufferedReader(ir);
		String str = br.readLine();
		boolean check=true;
		if(str.equals("end")) {
			check=!check;
		}else {
			System.out.println("Message : "+str);
		}
		return check;
	}
}
