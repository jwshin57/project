package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
		//	쓰레드 객체 생성
		Thread thread = new DigitThread();
		Thread thread2 = new AlphabetThread();
		
		//	쓰레드에 이름 지우주기
		thread.setName("DigitThread");
		thread2.setName("AlphabetThread");
		//	쓰레드를 실행 
		thread.start();
		thread2.start();
				
		//	메인 쓰레드의 실행 내용
		
		System.out.println("MainThread 종료");
		
	}

}
