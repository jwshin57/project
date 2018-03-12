package com.javaex.language.reftypes;

public class ArrayMultiEx {

	public static void main(String[] args) {
			//2차원 배열 선언
		int [][] td = new int[5][10];
		
		int table[][] = {
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 	// 1열
				{ 2, 3, 4, 5, 6, 7, 8, 9, 10, 1}, 	// 2열
				{ 3, 4, 5, 6, 7, 8, 9, 10, 1, 2},	// 3열 
				{ 4, 5, 6, 7, 8, 9, 10, 1, 2, 3},	// 4열
				{ 5, 6, 7, 8, 9, 10, 1, 2, 3, 4}	// 5열
		};
		
		
		//table 배열의 열 수...
		System.out.println("Row: " + table.length);
		System.out.println("Col: " + table[0].length);
		
		// row를 루프
		for (int row = 0; row < table.length; row++) {
			// clo을 루프
			for (int col = 0; col < table[row].length; col++) {
				//[row] [col] 값 가져오기
				System.out.print(table[row][col] + "\t");
				
			}
		System.out.println();
		}
		
		
		
	}

}
