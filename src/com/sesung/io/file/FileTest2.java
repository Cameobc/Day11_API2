package com.sesung.io.file;

import java.io.File;

public class FileTest2 {
	public static void main(String[] args) {
		File file = new File("c:\\");
		//list
		//파일이라면 해당 파일의 크기 출력.
		//디렉터리라면 폴더입니다 출력.
	
		String [] st = file.list();
		for(int i =0; i<st.length; i++) {
			File files = new File("c:\\"+st[i]);
			if(files.isFile()) {
				System.out.println(files.length());
			}else {
				System.out.println("폴더입니다");
			}
		}
		

		
//		File [] files = file.listFiles();
//		for(int i = 0; i<files.length; i++) {
//			if(files[i].isDirectory()) {
//				System.out.println("폴더입니다");
//			}else {
//				System.out.println(files[i].length());
//			}
//		}
	}

}
