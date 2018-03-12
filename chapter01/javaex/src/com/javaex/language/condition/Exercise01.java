package com.javaex.language.condition;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//	정수 입력
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 점수 입력하는 칸을 만듬
		
		//	3의 배수인지 판별
		//	출력
		if (num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}	else {
			System.out.println("3의 배수가 아닙니다");
		}
		sc.close();
	
		}

	}


