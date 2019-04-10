package com.sesung.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class ServerTest3 {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		FileReader fr = null;
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("클라이언트 연결 대기 중");
			ss= new ServerSocket(8081);
			s = ss.accept();
			System.out.println("연결 성공!");
			is = s.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String menu = br.readLine();
			if(menu.equals("점심")) {
				File file = new File("c:\\test", "lunch.txt");
				fw = new FileWriter(file, true);
				System.out.println("메뉴 입력");
				fw.write(sc.next());
				fw.flush();
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String lunch = br.readLine();
				lunch = br.readLine();
				String [] ln = lunch.split(",");
				Random random = new Random();
				int i = random.nextInt(ln.length);
				lunch = ln[i];
				os = s.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				bw.write(lunch);
				bw.write("\r\n");
				bw.flush();
			}else if(menu.equals("저녁")){
				File file = new File("c:\\test", "dinner.txt");
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String dinner = br.readLine();
				dinner = br.readLine();
				String [] dn = dinner.split(",");
				Random random = new Random();
				int i = random.nextInt(dn.length);
				dinner = dn[i];
				os = s.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				bw.write(dinner);
				bw.write("\r\n");
				bw.flush();
			}else {
				File file = new File("c:\\test", "dinner.txt");
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String dinner = br.readLine();
				dinner = br.readLine();
				File file2 = new File("c:\\test", "lunch.txt");
				fr = new FileReader(file2);
				br = new BufferedReader(fr);
				String lunch = br.readLine();
				lunch = br.readLine();
				String all = lunch+dinner;
				String [] al = all.split(",");
				Random random = new Random();
				int i = random.nextInt(al.length);
				menu = al[i];
				os = s.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				bw.write(menu);
				bw.write("\r\n");
				bw.flush();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				ow.close();
				os.close();
				fr.close();
				br.close();
				ir.close();
				is.close();
				s.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
