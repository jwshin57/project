/*	  입력 받을수있게 스캐너를 생성
 *   숫자를 판단하는데 짝수 홀수 구분해야함..
 *   짝수면 2부터 홀수면 1부터 시작 
 *   사용자가 입력한 값까지.
 *   입력받은수  +2
 *   합을출력
*/
package com.javaex.solo;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		int startNum;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		if(num%2==0) 
		{
			startNum = 2;
		}else
		{
			startNum = 1;
		}
		for(int i=startNum ; 1<=num; i=i+2)	
		{
			sum = sum + i;
			
		}
		System.out.println("결과값: " + sum);
		sc.close();
	}	

}
