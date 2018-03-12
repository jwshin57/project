package com.javaex.basicapi.arrays;

import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		
		//	배열 선언 
		int[] scores = { 80, 50, 30, 90, 96, 78, 80};
		System.out.println(scores);
		System.out.println(Arrays.toString(scores));
		
		//	소트의 시도
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		

		
		
	}

}
