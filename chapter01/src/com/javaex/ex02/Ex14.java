package com.javaex.ex02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		while(num!=0) {
			System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		if(num%3==0) {
			System.out.println("3의 배수입니다");
		}else {
			System.out.println("3의 배수가 아닙니다");
		}
		
	}
		System.out.println("종료합니다");
		
		sc.close();
}
}

