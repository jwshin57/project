package com.javaex.solo;

public class Ex11 {

	public static void main(String[] args) {
		
		int num = 0;
		
		for(int i = 1; i<=10; i++)
		{
			if(i%2==1)
			{
				num+=i;
			}
		}
		System.out.println(num);
		
	}
}
