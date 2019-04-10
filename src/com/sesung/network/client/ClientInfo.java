package com.sesung.network.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientInfo {

	public boolean sendServer(Socket s,OutputStream os, OutputStreamWriter ow, BufferedWriter bw, Scanner sc) throws Exception {
		os = s.getOutputStream(); // s에 outputstream 연결. outputstream 은 바이트를 처리함.
		ow = new OutputStreamWriter(os); // 문자를 처리 char
		bw = new BufferedWriter(ow);
		System.out.println("서버로 보낼 메세지 입력");
		String str = sc.next();
		bw.write(str);
		bw.write("\r\n");
		bw.flush();
		boolean check=true;
		if(str.equals("end")) {
			System.out.println("프로그램을 종료합니다.");
			check=!check;
		}
		return check;
	}

	public boolean receiveServer(Socket s, InputStream is, InputStreamReader ir, BufferedReader br) throws Exception {
		is =s.getInputStream();
		ir = new InputStreamReader(is);
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
