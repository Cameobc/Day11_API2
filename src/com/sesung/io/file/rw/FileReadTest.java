package com.sesung.io.file.rw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadTest {
	public static void main(String[] args) {
		MemberController mc = new MemberController();
		mc.start();
		System.out.println("종료합니다.");
	}
}
