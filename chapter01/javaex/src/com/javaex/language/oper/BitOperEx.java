package com.javaex.language.oper;

public class BitOperEx {

	public static void main(String[] args) {
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		//and연산 int로 변환하기때문에 byte는 자동으로 int 로 바뀜 
		int result = b1 & b2;
		System.out.println(Integer.
				toBinaryString(result));
		
		result = b1 | b2;
		System.out.println(Integer
				.toBinaryString(result));
		
		result = ~b1;
		System.out.println(Integer
				.toBinaryString(result));
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		
				
	}

}

