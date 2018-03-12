package com.javaex.oop.javaclass.staticex;

public class Singleton {
	private static Singleton instance =
	new Singleton();
	
	// 생성자 
	private Singleton() {
	}
	public static Singleton getInstance() {
		return instance;
	}
}
