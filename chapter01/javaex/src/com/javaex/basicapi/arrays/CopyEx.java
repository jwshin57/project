package com.javaex.basicapi.arrays;

import java.util.Arrays;

public class CopyEx {

	public static void main(String[] args) {
		//	배열 
		char[] src = "Java Programming".toCharArray();
		
		System.out.println("src:" + src);
		System.out.println(Arrays.toString(src));
		
		//	복사
		//	예전에 해봤던 방법 : System
		char[] target = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length);
		
		//	Arrays를 이용한 복사 방법1
		char[] target2 = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(target2));
		
		//	Arrays를 이용한 복사 방법2
		char[] target3 = Arrays.copyOfRange(src, 5, src.length);
		System.out.println(Arrays.toString(target3));
		
		
	}

}
