package com.javaex.language.condition;

import java.util.Scanner;

public class IfElseEx03 {

	public static void main(String[] args) {
		// 과목을 선택하세요 : 숫자입력
		System.out.println("과목을 선택하세요");
		System.out.println("1. 자바, 2. C, " + "3. C++, 4. 파이썬");
		System.out.print("과목번호:");
		
		// 과목 코드 입력
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		
		// 조건분기
		if (code == 1) {
			System.out.println("R101입니다.");
		}
		else if (code ==2) {
			System.out.println("R202입니다.");
		}
		else if (code ==3) {
			System.out.println("R303입니다.");
		}
		else if (code ==4) {
			System.out.println("R404입니다.");
		}
		else 			   {
			System.out.println("관리자에게 문의하세요");
		}
	
	}
		

}





//Ctrl+Shift+5
//파일 어떻게 옮기는지