package com.sesung.io.file;

import java.io.File;
import java.util.StringTokenizer;

public class FileTest3 {
	
	public static void main(String[] args) {
		File file = new File("c:\\test");
		String str = "iu-suzy-choa,hani";
		String sts = str.replace(",", "-");
		String [] st = sts.split("-");
		for(int i =0; i<st.length; i++) {
			File files = new File("c:\\test\\"+st[i]); //file, st[i]
			files.mkdir();
		}
	}

}
