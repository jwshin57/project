package com.javaex.ex02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요	\n단:");
		
		int dan = sc.nextInt();
		int i = 1;
		
		while (i<=9) {
			System.out.println(dan + " * " + i + " =" +dan*i);
			i++;
			
		}sc.close();
		
	}

}
