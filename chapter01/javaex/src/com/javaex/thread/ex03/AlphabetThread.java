package com.javaex.thread.ex03;

public class AlphabetThread extends Thread {
	
	//	실행코드 
	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			
			try {
				
			Thread.sleep(300); 	//	쓰레드 실행 잠시 중단 
			} catch (InterruptedException e) {
				
			System.out.println(e.getMessage());
			}
		}
		System.out.println(getName() + "쓰레드 종료");
	}
	
	
}
