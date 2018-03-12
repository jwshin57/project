package com.javaex.basicapi.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		
		//	기본 생성자
		Integer i = new Integer(10);
		Character c = new Character('c');
		Float f = new Float(3.14159);
		Boolean b = new Boolean(true);
		
		
		//	방법2: 문자열로 넣어도 됩니다
		
		Integer i1 = new Integer("10");
		Double d1 = new Double("3.14159");
		Boolean b1 = new Boolean("false");
//		Integer I2 = new Integer("abc");	//	주의
		
		
		//	자동 박싱의 예
		Integer i2 = 10;
		Double d2 = 3.14;
		Boolean b2 = false;
		
		//	자동 언박싱의 예
		int i3 = i2;
		double d3 = d2;
		boolean b3 = b2;
		
		//	valueOf 메서드
		
		Integer i4 = Integer.valueOf("1000");
		
		//	parse 계열 메서드 
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("10", 16));
		System.out.println(Double.parseDouble("3.14159"));
		
		//	변환 관련 
		System.out.println(i4.doubleValue());
		
		// 그 외 메서드들 
		
		System.out.println(Integer.toBinaryString(28)); //	2진수 형태 출력
		System.out.println(Integer.bitCount(28));		// 2진수에서 1의 개수
		System.out.println(Integer.toHexString(28));	//16진수 형태의 출력
		
		//포장된 값의 비교
		
		Integer i5 = new Integer(2018);
		Integer i6 = new Integer(2018);
		
		System.out.println(i5 == i6);
		
		//	방법1: 언박싱해서 비교
		System.out.println(i5.intValue() == i6.intValue());
		
		//	방법2: equals 
		System.out.println(i5.equals(i6));
		
		// 
		
		
	}

}
