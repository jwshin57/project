package com.javaex.language;

public class FloatDoubleEx {

	public static void main(String[] args) {
		//	float
		float floatVar = 3.14159F;
		double doubleVar = 3.14159;
		
		//	정밀도 체크 하는법?
		floatVar = 0.1234567890123456789F;
		doubleVar = 0.1234567890123456789;
		
		System.out.println("float:" + floatVar);
		System.out.println("double:" + doubleVar);
		
        // e표현을 이용
		floatVar = 3.14159e6f;
		System.out.println(floatVar);
		
		System.out.println(0.1 * 3);
		
	
		

	}

}
