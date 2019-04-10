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
import java.util.Random;

import javax.print.attribute.standard.Severity;

public class ServerTest2 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedReader br = null;
		String names = null;

		try {
			System.out.println("클라이언트 연결 대기 중");
			ss = new ServerSocket(8081);
			s = ss.accept();
			System.out.println("연결 성공!");
			is = s.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			names = br.readLine();
			String [] str = names.split(",");
			Random random = new Random();
			int i = random.nextInt(str.length);
			names = str[i];
			os = s.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			bw.write(names);
			bw.write("\r\n");
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				ow.close();
				os.close();
				ir.close();
				is.close();
				s.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}



	}

}
