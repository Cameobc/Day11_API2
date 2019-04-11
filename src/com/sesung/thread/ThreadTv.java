package com.sesung.thread;

public class ThreadTv extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		tv();
	}
	private void tv() {
		for(int i = 0; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("tv");
		}
	}
}
