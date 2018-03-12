//로또 번호구하기 중복있음

package com.javaex.ex03;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] lottoNums = new int[6]; 					// 배열 메모리 공간에 6개의 집을 생성
		
		
		for (int i=0; i<lottoNums.length; i++) {		//i 라는 변수 선언  i 는 로또넘버 끝까지  i는 1씩 늘어남
			lottoNums[i] = (int)(Math.random()*45)+1;	//랜덤 돌리는거
			
		System.out.println(lottoNums[i]);
		}
		
	}

}
