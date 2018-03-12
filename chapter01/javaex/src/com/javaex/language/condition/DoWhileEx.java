package com.javaex.language.condition;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요. 0이면 종료");
		int total = 0; // total 변수에 0을대입
		int num; // int타입에 num 변수를 선언
		// 정수를 입력받고
		Scanner sc = new Scanner(System.in); // 스캐너 호출
		
		num = sc.nextInt(); // 숫자를 입력받을 공간을 받음 
		
		do {
			System.out.println("숫자를 입력하세요. 0이면 종료"); // 이건 잘 모르겠음.;;;
			num = sc.nextInt(); // 숫자를 입력받는곳
			//	total = total = num;
			total += num; // 확장대입연산자 (total 이라는 변수랑 num 이라는변수랑 
						
		} while(num != 0);
		
		
		// 0이면 종료
		// 0이 아니면 합계에 추가
		// 루프가 끝나면 결과를 출력
		System.out.println("합계:" + total);
		sc.close();
		
		
		
		
	}

}
