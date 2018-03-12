package com.javaex.oop.javaclass.staticex;

public class StaticEx {
	//	static 멤버
	
	static int refCount;
	static String classVar; //	클래스 멤버
	String instanceVar; 	// 인스턴스 멤버
	//	static 블록: static 멤버의 초기화
	
	static {
//		instanceVar = "Instance Member";
		refCount = 0;
		classVar = "Class Member";
		System.out.println("static block");
		
	}
	
	//	생성자
	
	public StaticEx() {
		refCount++;
		instanceVar = "Instance Member";
		System.out.println("instance created");
	}
	
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		System.out.println("Finalize Called");
	}
}
