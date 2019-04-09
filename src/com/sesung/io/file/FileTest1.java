package com.sesung.io.file;

import java.io.File;

public class FileTest1 {
	public static void main(String[] args) {
		File file = new File("C:\\test\\ex1.txt");
		file = new File("c:\\test", "ex1.txt");
		file = new File("c:\\test");
		File file2 = new File(file, "ex1.txt");
		
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.length());
		File [] files = file.listFiles();
		File file3 = new File("c:\\");
		String [] ar = file3.list();
		
		file = new File("c:\\test\\iu\\test");
		file.mkdirs();
		//file.mkdirs(); 디렉토리들 만들기
		//fiel.mkdir(); 디렉토리만들기
		file = new File("c:\\test\\test2");
		file.delete();
//		file.createNewFile(파일명); // 새로운 파일 만들기
		
//		for(int i =0; i<ar.length; i++) {
//		System.out.println(ar[i]);
//		}
	}

}
