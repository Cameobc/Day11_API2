package com.sesung.network.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class ServerMenu {
	private String [] lunch;
	private String [] dinner;

	public void init() throws Exception {  //사전작업
		File file = new File("c:\\test\\lunch.txt");
		//lunch
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		String menus = br.readLine();
		lunch = menus.split(",");
		br.close();
		fr.close();
		file = new File("c:\\test\\dinner.txt");
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		br.readLine();
		menus = br.readLine();
		dinner = menus.split(",");
		br.close();
		fr.close();
	}

	public String getlunch() {
		String menu = null;
		Random random = new Random();
		int i = random.nextInt(lunch.length);
		menu = lunch[i];
		return menu;
	}

	public String getdinner() {
		String menu = null;
		Random random = new Random();
		int i = random.nextInt(dinner.length);
		menu = dinner[i];
		return menu;
	}

	public String getRandom() {
		String menu = null;
		Random random = new Random();
		
		
		return menu;
	}

}
