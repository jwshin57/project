package com.javaex.language.condition;

public class ForGugu {

	public static void main(String[] args) {
		
		//2~9까지 단을 돌면서
		// 각 단의 구구표를 만든다
		for (int dan= 2; dan <=9; dan++ ) {
			for (int num = 1; num <=9; num++) {
				System.out.println(dan + "*" + num
						+ "=" + dan + num);
			}
		}

	}

}
