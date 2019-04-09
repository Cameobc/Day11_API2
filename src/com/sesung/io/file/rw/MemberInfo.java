package com.sesung.io.file.rw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberInfo {

	private Scanner sc;
	private ArrayList<Member> names;

	public MemberInfo() {
		sc = new Scanner(System.in);
		names = new ArrayList<Member>();
	}
	
	private ArrayList<Member> searchTeam(Scanner sc, ArrayList<Member> names){
		System.out.println("그룹명 입력");
		ArrayList<Member> search = new ArrayList<Member>();
		String name = sc.next();
		for(Member m : names) {
			if(name.equals(m.getGroup())) {
				search.add(m);
			}
		}
			return search;
	}
	
	private ArrayList<Member> searchCompany(Scanner sc, ArrayList<Member> names){
		System.out.println("소속사명 입력");
		ArrayList<Member> search = new ArrayList<Member>();
		String name = sc.next();
		for(Member m : names) {
			if(name.equals(m.getEn())) {
				search.add(m);
			}
		}
		return search;
	}
	
	public ArrayList<Member> searchGroup(Scanner sc, ArrayList<Member> names) {
		System.out.println("1.그룹명으로 검색");
		System.out.println("2.소속사로 검색");
		int select = sc.nextInt();
		ArrayList<Member> search = null;
		String name = null;
		if(select==1) {
			search=this.searchTeam(sc, names);
		}else {
			search = this.searchCompany(sc, names);
		}
		return search;
	}

	public Member searchMember(Scanner sc,ArrayList<Member> names) {
		System.out.println("검색할 멤버의 이름을 입력하세요.");
		String name = sc.next();
		Member s = null;
		for(Member m : names) {  // names에서 하나 꺼내면 Member 데이터. 그래서 이런 형식으로 쓰는 것임.
			if(name.equals(m.getName())) {
				s =m;
				break;
			}
		}
		return s;

	}

	public ArrayList<Member> getMembers() {
		FileReader fr = null;
		BufferedReader br = null;
		File file = new File("c:\\test", "readTest.txt");
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			// \n 개행문자
			String str = null;
			br.readLine();
			while(true) {
				str = br.readLine();
				if(str==null) {
					break;
				}
				String [] name = str.split("-");
				Member member = new Member();
				member.setGroup(name[0]);
				member.setName(name[1]);
				member.setAge(Integer.parseInt(name[2]));
				member.setAct(name[3]);
				member.setEn(name[4]);
				names.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return names;
	}

}
