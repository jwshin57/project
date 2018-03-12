package com.javaex.oop.javaclass.staticex;

public class StaticExApp {

	public static void main(String[] args) {
		
		StaticEx s1 = new StaticEx();
		System.out.println("RefCount=" + StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();
		System.out.println("RefCount=" + StaticEx.refCount);
		
		s1 = null;		//	데이터 사용 안함
		System.gc();
		
		try {
			Thread.sleep(3000);
		}catch (Exception e) {
			
		}
		System.out.println("RefCount=" + StaticEx.refCount);
		
		
	}

}
