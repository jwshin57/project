package com.javaex.thread.ex01;

public class DigitThread extends Thread {
	//	실행 로직은 run 메서드 오버라이드 후 구현
	@Override
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(getName() + ":" + i);
			try {
				Thread.sleep(200);
			}	catch(InterruptedException e) {
				System.out.println(getName() + ":" + e.getMessage());
			}
		}
	}
}
