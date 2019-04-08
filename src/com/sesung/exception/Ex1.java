package com.sesung.exception;

public class Ex1 {

	public void test() throws Exception {  //ArithmeticException
		int a =10;
		int b =0;
		System.out.println(a/b);
		//throw new ArithmeticException
	}
}
