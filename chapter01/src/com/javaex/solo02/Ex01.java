package com.javaex.solo02;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		
		int count = 0;
		int sum = 0;
		
		for(int i = 0; i<data.length; i++) // 순회한다잉~
		{
			if(data[i]%3==0) {			   // 3으로 나눈다잉~ 
				count++;				   // 카운트 한다잉
				sum += data[i];			   // 더한다잉~
			}
		}
		System.out.println("3의 배수의 개수=>" + count);
		System.out.println("3의 배수의 합=>" + sum);
	}

}
