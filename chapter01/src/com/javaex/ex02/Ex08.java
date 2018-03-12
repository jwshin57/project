package com.javaex.ex02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.println("31일 입니다");
			break;
		case 2 : 
			System.out.println("28일 입니다");
			break;
		case 3 : 
			System.out.println("31일 입니다");
			break;
		case 4 : 
			System.out.println("30일 입니다");
			break;
		case 5 : 
			System.out.println("31일 입니다");
			break;
		case 6 : 
			System.out.println("30일 입니다");
			break;
		case 7 :
			System.out.println("31일 입니다");
			break;
		case 8 : 
			System.out.println("31일 입니다");
			break;
		case 9 : 
			System.out.println("30일 입니다");
			break;
		case 10 : 
			System.out.println("31일 입니다");
			break;
		case 11 : 
			System.out.println("30일 입니다");
			break;
		case 12 :
			System.out.println("31일 입니다");
			break;
		default :
			System.out.println("아몰랑");
			
		}
		sc.close();
		
	}

}
