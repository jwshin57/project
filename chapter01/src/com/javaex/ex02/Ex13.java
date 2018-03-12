package com.javaex.ex02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해 주세요.\n단: ");
		int dan =sc.nextInt();
		
		
		for(int i = 1; i <=9; i++) {
			System.out.println(dan + " * " + i + " = " +dan * i);
			
		}
	}

}
