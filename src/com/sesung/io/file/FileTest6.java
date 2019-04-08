package com.sesung.io.file;

import java.io.File;
import java.util.Calendar;

public class FileTest6 {
	
	public static void main(String[] args) {
		String filename="";
		Calendar calendar = Calendar.getInstance();
		long l =calendar.getTimeInMillis();
		filename = "a"+l;
		File file = new File("c:\\test\\", filename);
		file.mkdir();
		
//		String [] str = file.list();
//		Calendar calendar = Calendar.getInstance();
//		long l =calendar.getTimeInMillis();
//		String st = Long.toString(l);
//		boolean check = true;
//		
//		while(true) {
//			File file2 = new File(file, st);
//			file2.mkdir();
//		}
		

	}
}
