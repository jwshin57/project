package com.javaex.language.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		// 배열 선언
		String[] students;
		int scores[]; 
		
		//	초기화
		students = new String[] {
			"홍길동",
			"전우치",
			"임꺽정",
			"신정우"
		};

		scores = new int[4];
		
		
		scores[0] = 90;
		scores[1] = 85;
		scores[2] = 75;
		scores[3] = 88;
		//		scores[4] = 90; : Index Error
		System.out.println("배열길이: " + scores.length);
		
		// 순차적으로 돌면서 정보를 표현 
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s: score = %d%n"
					, students[i]
					, scores[i]);
		}
	}

}
