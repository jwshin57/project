package com.javaex.language.console;

import java.util.Scanner; //호출먼저하기

//import java.util.Scanner; // 스캐너를 로딩해와야지 사용가능  스캐너가 하는역활을 물어보기

public class ConsoleInputEx {

	public static void main(String[] args) {
		
		
		//스캐너 로드
		Scanner sc = new Scanner(System.in);  // 클래스 전에 호출해야 사용가능 
		
		
		//나이를 입력받는곳
		System.out.println("나이를 입력해 주세요"); // 입력하기전 출력되는 메세지
		int age = sc.nextInt();  
		//System.out.println(age);  나이를 호출
		
		//이름을 입력받는곳
		System.out.println("이름을 입력해 주세요"); // 이름을 입력하는 메시지
	
		String name = sc.next();  // 문자입력받기 
		System.out.println("당신의 이름은" + name + ", 나이는" + age + "입니다");
		
		
		//결과출력
		// System.out.println)"당신의 이름은" + name + ", 나이는" + age + "입니다");
		
		
		sc.close();
		
		

	}

}
