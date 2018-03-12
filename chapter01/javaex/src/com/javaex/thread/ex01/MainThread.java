package com.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) {
		//	쓰레드 객체 생성
		Thread thread = new DigitThread();
		//	쓰레드에 이름 지우주기
		thread.setName("DigitThread");
		//	쓰레드를 실행 
		thread.start();
				
		//	메인 쓰레드의 실행 내용
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			
			try {
				
			Thread.sleep(300); 	//	쓰레드 실행 잠시 중단 
			} catch (InterruptedException e) {
				
			System.out.println(e.getMessage());
			}
		}
		
		System.out.println("MainThread 종료");
		
	}

}
