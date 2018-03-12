package com.javaex.collections.generic.ex02;

public class BoxApp {

	public static void main(String[] args) {
		//	범용 박스 
		Box<Integer> intBox = new Box<>();
		intBox.setContent(123);
//		intBox.setContent("String"); // 컴파일 타임에서 체크 가능 
		
		//	박스에서 값을 가져와서 변수에 담아봅시다
		int intVal = intBox.getContent(); //	캐스팅 안해도 되는 편의성
		
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");
		
		String strVal = strBox.getContent(); //	캐스팅  필요없음
		
		
		
		
	}

}
