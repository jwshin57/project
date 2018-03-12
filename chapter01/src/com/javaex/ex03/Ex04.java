package com.javaex.ex03;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] lottoNums = new int[6];
		
		for(int i=0; i<lottoNums.length; i++) {
					lottoNums[i]= (int)(Math.random()*45)+1;
		}
		for(int i=0; i<lottoNums.length; i++) {
			System.out.println(lottoNums[i]);
		}
		
	}

}
