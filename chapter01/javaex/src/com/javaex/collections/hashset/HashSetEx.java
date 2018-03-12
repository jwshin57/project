package com.javaex.collections.hashset;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		//	선언
		HashSet<String> hs = new HashSet<>();
		
		//	객체의 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		
		//	이미 있는 값을 또 넣어봅시다~
		hs.add("Java");	
		
		//	전체의 크기를 구해봅시다! 
		System.out.println("hs size:" + hs.size());
		System.out.println(hs);
		
		
		//	지정 객체를 포함하고 있는가?
		System.out.println(hs.contains("C++"));
		
		//	삭제
		hs.remove("C++");
		System.out.println(hs);
		
		
		
	}
	

}
