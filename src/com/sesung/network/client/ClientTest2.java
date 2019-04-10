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

public class ClientTest2 {
	public static void main(String[] args) {
		Socket s = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner sc = new Scanner(System.in);
		try {
			s = new Socket("211.238.142.23", 8081);
			System.out.println("서버 연결 성공");
			os = s.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			System.out.println("사람이름을 입력하세요.");
			String names = sc.next();
			bw.write(names);
			bw.write("\r\n");
			bw.flush();
			is = s.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			names = br.readLine();
			System.out.println(names);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
				sc.close();
				bw.close();
				ow.close();
				os.close();
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
