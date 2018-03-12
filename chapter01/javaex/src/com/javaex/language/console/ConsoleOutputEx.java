package com.javaex.language.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {

		// 간단한 출력
		System.out.print("hello");
		System.out.println(",java");
	
		System.out.println("hello" + "," + "java");
		System.out.println("Number" + 1);
		
		// 이스케이프 문자 (\) 
		
		System.out.println("Hello, \njava"); //개행
		System.out.println("hello, \tjava"); //몇칸뛰고
		
		System.out.println("Hello, \"java\"");  // " 을 표현하기위해 \" 를 사용
			System.out.println("\\"); // "\" 를 표현하기위해 \\를 사용
			
			
		
		
		
		
		
	}

}
