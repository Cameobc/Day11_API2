package com.sesung.io.file;

import java.io.File;
import java.util.Scanner;

public class FileTest5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("디렉토리명을 입력해주세요.");
		String name = sc.next();
		File file = new File("c:\\test", name);
		if(file.exists()){
			file.mkdir();
		}else {
			file.delete();	
			}
//		File file = new File("c:\\test");
//		String [] str = file.list();
//
//		for(int i =0; i<str.length; i++) {
//			File file2 = new File(file, str[i]);
//			if(name.equals(str[i])) {
//				file2.delete();
//			}else {
//				file2.mkdir();
//			}
//		}
	}

}
