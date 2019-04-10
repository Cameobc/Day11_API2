package com.sesung.network.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class test {

	public static void main(String[] args) throws Exception {
		BufferedReader br = null;
		FileReader fr = null;
		try {
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
		System.out.println(all);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
