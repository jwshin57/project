package com.javaex.collections.generic.ex01;

public class BoxApp {

	public static void main(String[] args) {
		//	범용 박스 
		Box intBox = new Box();
		intBox.setContent(123);
		
		//	박스에서 값을 가져와서 변수에 담아봅시다
		int intVal = (int)intBox.getContent();
		
		Box strBox = new Box();
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent(); //	캐스팅 꼭 필요
		
		//	그런데...
		//	만약 캐스팅을 잘못 했다면
		strVal = (String)intBox.getContent();
		
		
		
	}

}
