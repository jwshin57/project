package com.javaex.language.oper;

public class RelOperEx {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 3;
		
		//==같다 , !=다르다
		
		System.out.println(a == b);
		System.out.println(a != b);
		
		System.out.println(a > b);
		System.out.println(a <= b);
		
		System.out.println();
		//	AND( && ) , OR( || ) , NOT(!)
		
		System.out.println(a % 2 != 0 && b % 2 != 0);
		
		

	}

}
