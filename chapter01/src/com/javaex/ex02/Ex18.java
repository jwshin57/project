package com.javaex.ex02;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		while (true) {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계" + sum);
			
			if(num==0) {
				break; // 탈출 
			}
		}
	
//		do 
//		{
//			num = sc.nextInt();
//			sum = sum + num;
//			System.out.println("합계" + sum);
//		}while(num != 0);
		
		System.out.println("종료");
		sc.close();	
		
		
		
		
	}

}
