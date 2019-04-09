package com.sesung.io.file.rw;

import java.util.ArrayList;

public class MemberView {
	
	public void view(String s) {
		System.out.println(s);
	}
	
	public void view(Member s) {
		System.out.print("그룹명 : "+s.getGroup()+"\t");
		System.out.print("이  름 : "+s.getName()+"\t");
		System.out.print("나  이 : "+s.getAge()+"\t");
		System.out.print("역  할 : "+s.getAct()+"\t");
		System.out.println("소속사 : "+s.getEn());
	}
	
	public void view(ArrayList<Member> names) {
		for(Member s :names) {
			System.out.print("그룹명 : "+s.getGroup()+"\t");
			System.out.print("이름 : "+s.getName()+"\t");
			System.out.print("나이 : "+s.getAge()+"\t");
			System.out.print("역할 : "+s.getAct()+"\t");
			System.out.println("소속사 : "+s.getEn());
		}
	}

}
