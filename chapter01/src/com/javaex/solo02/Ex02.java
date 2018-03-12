package com.javaex.solo02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] dataArray = new int[5];
		int num;
		double sum =0;
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<dataArray.length; i++) {
			num = sc.nextInt();	
				dataArray[i] = num;
		
		}for (int n:dataArray) {
			sum += n;
		}
		System.out.println("평균은" + sum/5 + "입니다");
		
		sc.close();
		
		
	

	}
}
