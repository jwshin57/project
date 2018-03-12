package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 60;
		System.out.print("점수를 입력하세요 :");
		int num2 = sc.nextInt();
		
		if(num1 <= num2) { 
			System.out.println("합격입니다.");
		}else { 
		System.out.println("불합격 입니다.");
		}
		sc.close();
		
	}

}
