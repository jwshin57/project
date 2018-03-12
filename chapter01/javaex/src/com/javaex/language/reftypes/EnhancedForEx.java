package com.javaex.language.reftypes;

public class EnhancedForEx {

	public static void main(String[] args) {
		// char 배열에 A ~ Z 까지 채워두고
		char[] alps = new char[26];
		
		for (int i = 0; i < alps.length; i++) {
			alps[i] = (char)(65 + i);
			
		}
		// for loop를 돌면서 하나씩 조회, 출력
		
		for (char c:alps) {
			System.out.print(c + "\t");
		}
		System.out.println();
		
		
		
	}

}
