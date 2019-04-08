package com.sesung.io.file;

import java.io.File;

public class FileTest4 {
	public static void main(String[] args) {
		File file = new File("c:\\test\\iu");
		//이미지 파일을 제외한 나머지는 삭제  jpg, bmp, jepg
		
		String [] str = file.list();
		for(int i =0; i<str.length; i++) {
			int point = str[i].lastIndexOf(".");
			String po = str[i].substring(point+1);
			if(!(po.equals("jepg") || po.equals("bmp") || po.equals("jpg"))) {
				File file2 = new File(file, str[i]);
				file2.delete();
			}
		}
	}

}
