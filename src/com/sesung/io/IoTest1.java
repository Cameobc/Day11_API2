package com.sesung.io;

import java.io.IOException;
import java.io.InputStream;

public class IoTest1 {

	public static void main(String[] args) {
		System.out.println("입력");
		InputStream is = System.in;
		//read
		try {
			int a = is.read(); // 1byte만 읽어들임.
			System.out.println((char)a);
			a = is.read();
			System.out.println((char)a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료");
	}
}
