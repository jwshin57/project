package com.javaex.language.condition;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// 	등급 판별
		Scanner sc = new Scanner (System.in); // 스캐너 선언 
		int score = sc.nextInt(); // 점수 받기
		String grade; // String 타입 선언 하고 grade 변수 선언
		
		//	등급 판별
		if (score >=90) {
			grade = "A";
		}else if (score >= 80) {
			grade = "B";
		}else if (score >= 70) {
			grade = "c";
		}else if (score >= 60) {
			grade = "D";
		}else {
			grade = "F";
			
		}
		//	출력
		System.out.println(grade + "등급");
		sc.close(); // 닫아주는거 꼭 중요합니다
		
		
	}

}
