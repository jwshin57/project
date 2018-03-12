/*  스캐너로 사용자에게 입력받을 값을 만들곳을 생성
i = 1 이라는 변수를 선언  i 는 num보다 작거나 같다  i 는 1씩 늘어남
j = 1 이라는 변수를 선언 j 는 i 보다 작거나 같다 j 는  1씩 늘어남
출력은 i 
*/
package com.javaex.solo;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for (int i = 1; i<=num; i++ ) {
			for(int j = 1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
			sc.close();
	}

}
