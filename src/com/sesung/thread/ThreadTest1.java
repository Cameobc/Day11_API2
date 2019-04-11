package com.sesung.thread;

public class ThreadTest1 {
	public static void main(String[] args) {
		ThreadEat te = new ThreadEat();
		ThreadTv tt = new ThreadTv();

		//run 메서드 호출 금지
		//start() <- os에 부탁하는 것임
//		te.start();
//		tt.start();
		ThreadMusic tm = new ThreadMusic();
		Thread t = new Thread(tm, "iu");
		Thread t2 = new Thread(tm, "suzy");
		t.start();
		t2.start();
	}

}
