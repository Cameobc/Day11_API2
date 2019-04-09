package com.sesung.io.file.rw;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	private Scanner sc;
	private MemberView mv;
	private MemberInfo mi;
	private MemberAdd ma;

	public MemberController() {
		sc = new Scanner(System.in);
		mv = new MemberView();
		mi = new MemberInfo();
		ma = new MemberAdd();
	}

	public void start() {
		boolean check = true;
		ArrayList<Member> names = new ArrayList<Member>();

		while(check) {
			System.out.println("번호를 입력하세요.");
			System.out.println("1.멤버정보 호     출");
			System.out.println("2.멤버정보 전체출력");
			System.out.println("3.멤버정보 검색출력");
			System.out.println("4.그룹검색 출력하기");
			System.out.println("5.멤     버 추가하기");
			System.out.println("6.프로그램 백     업");
			System.out.println("7.프로그램 종     료");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				names = mi.getMembers();
				System.out.println("정보 호출 성공");
				System.out.println("==================");
				break;
			case 2:
				mv.view(names);
				System.out.println("==================");
				break;
			case 3:
				Member m = mi.searchMember(sc, names);
				if(m!=null) {
					mv.view(m);
				}else {
					mv.view("멤버가 없습니다.");
				}
				System.out.println("==================");
				break;
			case 4:
				ArrayList<Member> search = mi.searchGroup(sc, names);
				if(search.size()>0) {
						mv.view(search);
				}else {
					mv.view("잘못 입력했습니다.");
				}
				break;
			case 5:
				Member member = ma.addMember();
				names.add(member);
				break;
			case 6:
				ma.backUp(names);
				break;
			case 7:
				check =!check;
				sc.close();
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
		}

		//		MemberView mv = new MemberView();
		//		MemberInfo mi = new MemberInfo();
		//		ArrayList<Member> names = mi.getMembers();
		//		mv.view(names);

	}
}
