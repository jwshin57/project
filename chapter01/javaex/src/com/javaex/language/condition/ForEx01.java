package com.javaex.language.condition;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		//while 문을 for 문으로 만드는것 (구구단)
		//루프(for) - 안에서 dan * 1,2,3,4,....9
		
		Scanner sc = new Scanner(System.in); // 스캐너 호출
		System.out.println("단을 입력하세요"); // 출력
		System.out.println("단:"); // 출력
	
		int dan = sc.nextInt(); // 입력하는곳.....
		
		for (int num = 1; num <= 9; num++) {
			System.out.println(dan + "*" + num + "=" +dan * num);
		}
		sc.close();
	}

}
