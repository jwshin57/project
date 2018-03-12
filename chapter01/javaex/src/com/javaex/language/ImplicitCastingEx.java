package com.javaex.language;

public class ImplicitCastingEx {

	public static void main(String[] args) {
		byte b = 25;
		System.out.println(b);
		
		short s = b;
		System.out.println(s);
		
		int i = s;
		System.out.println(i);
		
		long l = i;
		System.out.println(l);
		
		//정수형의 변환
		
		float f = l;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
		
		int num1 = 4;
		int num2 = 3;
		
		System.out.println(num1 / num2);
		

	}

}
