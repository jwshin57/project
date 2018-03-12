package com.javaex.basicapi.arrays;

import java.util.Arrays;

public class EqualsEx {

	public static void main(String[] args) {
		int[][] src = {
				{ 1, 2, 3, 4, 5 },
				{ 6, 7, 8, 9, 10}
				
		};
		
		//일반적인 복제 방법
		int [][] copy = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.equals(src, copy));
		System.out.println(Arrays.deepEquals(src, copy));
		//	얕은 복제라고도 합니다 
		// 	이럴 경우, 다음과 같은 문제가 발생합니다
		src[1][3] = 0;
		System.out.println(copy[1][3]);
		
		
		//	깊은 복제의 시도
		int[][] deepcopy = Arrays.copyOf(src, src.length); // 1차 복제
		for (int i = 0; i < src.length; i++) {
			deepcopy[i] = Arrays.copyOf(src[i], src[i].length);
			
		}
		
		src[0][2] = 10;
		System.out.println(deepcopy[0][2]);
		
		System.out.println(Arrays.deepEquals(src,  deepcopy));
		
	}

}
