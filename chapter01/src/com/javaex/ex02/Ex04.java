package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자를 입력해 주세요: ");
		int num = sc.nextInt();
				
		if(num > 0) {
			System.out.println("양수입니다");
		}else if(num < 0) {
			System.out.println("음수입니다");
		}else if(num == 0) {
			System.out.println("0입니다");
		}else {
			System.out.println("꺼져!!");
		
		}
			sc.close();
		
		
		
		
		
	}

}
