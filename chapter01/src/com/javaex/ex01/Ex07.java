package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		System.out.println( (a>b)  &&  (a<b) );//거짓 : 참 == 거짓
		System.out.println((a>b) && (a>b)); // 거짓 : 거짓 == 거짓
		
		System.out.println("-----------------------");
		System.out.println((a>b) || (a<b)); // 거짓 : 참  ==참
		
		System.out.printf("안녕");
	}

}
