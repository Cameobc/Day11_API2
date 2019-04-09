package com.sesung.io.file.rw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberAdd {
	
	public void backUp(ArrayList<Member> name) {
		//저장경로 - 원래파일에 덮어쓰기
		File file = new File("c:\\test", "readTest.txt");
		FileWriter fw = null;
		try {
		fw = new FileWriter(file, false);
		fw.write("start");
		for(Member m:name) {
			StringBuffer sb = new StringBuffer();
			sb.append(m.getGroup());
			sb.append("-");
			sb.append(m.getName());
			sb.append("-");
			sb.append(m.getAge());
			sb.append("-");
			sb.append(m.getAct());
			sb.append("-");
			sb.append(m.getEn());
			sb.append("\r\n");
			fw.write(sb.toString());
			fw.flush();
		}
//		for(int i =0; i<name.size(); i++) {
//			fw.write(name.get(i).getGroup());
//			fw.write("-");
//			fw.write(name.get(i).getName());
//			fw.write("-");
//			fw.write(name.get(i).getAge()+"");  // 숫자를 문자열로 바꾸는 경우는 뒤에 "" 를 추가하거나 valueof()로 전체를 감싸준다.
//			fw.write("-");
//			fw.write(name.get(i).getAct());
//			fw.write("-");
//			fw.write(name.get(i).getEn());
//			fw.write("\r\n");
//		}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("파일백업완료");
	}
	
	
	public Member addMember() {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.println("멤버 이름을 입력하세요.");
		member.setName(sc.next());
		System.out.println("소속사를 입력하세요.");
		member.setEn(sc.next());
		System.out.println("그룹명을 입력하세요.");
		member.setGroup(sc.next());
		System.out.println("나이를 입력하세요.");
		member.setAge(sc.nextInt());
		System.out.println("역할을 입력하세요.");
		member.setAct(sc.next());
		return member;
	}

}
