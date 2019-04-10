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

public class ClientTest3 {

	public static void main(String[] args) {
		Socket s = null;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		try {
			s = new Socket("211.238.142.23", 8081);
			os = s.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			System.out.println("점심, 저녁, 아무거나 중 택 1");
			String menu = sc.next();
			bw.write(menu);
			bw.write("\r\n");
			bw.flush();
			is = s.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			menu = br.readLine();
			System.out.println(menu);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
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
