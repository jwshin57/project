package com.javaex.language.reftypes;

public class ArrayCopyFor {

	public static void main(String[] args) {
		int source[] = { 1, 2, 3 };
		int target[] = new int [10];
		
		//	for문을 돌면서 source를 target으로 복사
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
			
		}
		
		// 새 배열의 출력
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		
		System.out.println();
		
		
	}

}
