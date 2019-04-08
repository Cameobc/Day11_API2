package com.sesung.exception;

public class Ex2 {

	public void ex2() {
		//어린이집 
		int num = 52;
		int num2 = 82;
		int result1 = num+num2;
		int result2 = num-num2;
		try {
		if(result1>99 || result2<0) {
			throw new MyException();
		}
		}catch(Exception e) {
			System.out.println("세자리수 계산 불가");
		}
	}
}
