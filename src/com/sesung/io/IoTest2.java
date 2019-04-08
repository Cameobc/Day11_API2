package com.sesung.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoTest2 {
	public static void main(String[] args) {
		//키보드로부터 입력받은 문자열을 출력
		//byte로 받아서 문자 한 글자로 변환해서 이 문자들을 연결.
		System.out.println("입력");
		InputStream is = System.in; //byte처리
		InputStreamReader ir = new InputStreamReader(is); //문자를 처리
		BufferedReader br = new BufferedReader(ir);
		try {
			String st = br.readLine();
			System.out.println(st);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
