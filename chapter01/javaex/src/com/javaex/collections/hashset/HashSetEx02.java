package com.javaex.collections.hashset;

import java.util.HashSet;

class SimpleNum {
	//	필드
	int num;

	//	생성자
	public SimpleNum(int num) {
		this.num = num;
	}
	
	//	문자열 출력 오버라이드
	@Override
	public String toString() {
		return String.valueOf(num);
		
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SimpleNum) {
			return num == ((SimpleNum)obj).num;
			
		}
		return super.equals(obj);
		
	}
	@Override
	public int hashCode() {
		return num % 10;
	}
}
public class HashSetEx02 {

	public static void main(String[] args) {
		HashSet<SimpleNum> hs = new HashSet<>();
		
		SimpleNum s1 = new SimpleNum(10);
		SimpleNum s2 = new SimpleNum(20);
		SimpleNum s3 = new SimpleNum(20);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
		
		System.out.println(s2.equals(s3));
		System.out.println("s2 hash:" + s2.hashCode());
		System.out.println("s3 hash:" + s3.hashCode());
		
	}

}
