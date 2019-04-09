package com.sesung.io.file.rw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
	public static void main(String[] args) {
		File file = new File("c:\\test", "writeTest.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file, true);
			fw.write("fifth write");
			fw.write("-");
			fw.write("fifth write");
			fw.write("-");
			fw.write("fifth write");
			fw.write("-");
			fw.write("fifth write");
			fw.write("-");
			fw.write("fifth write");
			fw.write("\r\n");
			fw.flush(); // 버퍼를 강제로 비우세요.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("파일작성완료");
	}

}
