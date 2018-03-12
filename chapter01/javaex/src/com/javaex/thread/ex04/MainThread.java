package com.javaex.thread.ex04;

public class MainThread {

	public static void main(String[] args) {
		//	쓰레드 객체 생성
		Thread thread = new DigitThread();
//		Thread thread2 = new AlphabetThread();
		Thread thread2 = new Thread(new AlphabetThread());
		
		//	쓰레드에 이름 지우주기
		thread.setName("DigitThread");
		thread2.setName("AlphabetThread");
		//	쓰레드를 실행 
		thread.start();
		thread2.start();
				
		//	메인 쓰레드에 작업 쓰레드 합류
		try {
		thread.join();
		thread2.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("MainThread 종료");
		
	}

}
