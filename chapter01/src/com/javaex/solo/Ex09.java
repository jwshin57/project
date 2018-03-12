package com.javaex.solo;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작");
		int dan = 1;
		int num = sc.nextInt();
		
		while (dan<=9)
		{
			System.out.println(num +" * " + dan + " = " + num * dan );
			dan++;
		}
		sc.close();
	}

}
