package com.javaex.oop.javaclass.staticex;

public class StaticApp {

	public static void main(String[] args) {

//		Singleton s1 = new singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		
	}

}
