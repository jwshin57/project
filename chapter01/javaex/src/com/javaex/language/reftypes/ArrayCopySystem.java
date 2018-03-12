package com.javaex.language.reftypes;

public class ArrayCopySystem {

	public static void main(String[] args) {
		//	원본 배열 
		int source[] = { 1, 2, 3, };
		int target[] = new int[10];
		
		System.arraycopy(source, 0, target, 0, source.length);
		
		
//		System.out.println(target);
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t"); 
		}
		System.out.println();
	}

}
