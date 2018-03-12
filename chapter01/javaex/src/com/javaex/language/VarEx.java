package com.javaex.language;

public class VarEx {
	public static void main(String[] args) {
		// 변수 선언
		// 문자, 순자, $, _
		// 숫자로 시작하면 안됨
		// 관례) 변수는 소문자로 구성, 
		// 단어의 조합, 뒤 단어의 첫글자를 대문자

		//방법1
//		int myAge; //	변수를 선언 
//		myAge = 47;   선언한고 값을 할당
		
		//	방법2
		int myAge = 47;
		
		//조회 및 사용
		System.out.println(myAge);
		
		// 변수의 변경
		myAge = 21;
		
		System.out.println(myAge);
		
		//변수를 선언할때 여러변수 동시선언
		int v1 = 10, v2 = 20, v3 = 30; //세개의 값을 다 동일한 숫자로 변경하고싶을때
//		v1 = 40; 따로하는방법
//		v2 = 40; 
//		v1 = v2 = v3 = 40; 한번에 하는방법
		
		
	}
}
