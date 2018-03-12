package com.javaex.language.condition;

import java.util.Scanner;

public class IfElseEx01 {

	public static void main(String[] args) {
	
		// 점수 입력 받기 프로그램
		
		Scanner sc = new Scanner(System.in); // 작성하고 스캐너 호출어케하는지
		
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		
		//결정
		if (score >= 60) {
			System.out.println("합격");
		} 
		
		
		else {
			System.out.println("불합격");
		}
		
		sc.close();
		
		
		
		//  3항 연산자를 이용
		  System.out.println(
		  (score >= 60) ? "합격": "불합격");
		 
		
		
	}

}
