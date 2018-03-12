package com.javaex.language.reftypes;

public class ArrayCommandEx {

	public static void main(String[] args) {
		//	java ArrayCommandEx 1 3 5 7 9
		for (int i = 0; i <args.length; i++) {
			System.out.println(args[i]);
			
		}
		int total = 0;
		
		for (int i = 0; i < args.length; i++) {
			total += Integer.parseInt(args[i]);
			
		}
		
		System.out.println("입력된 인수의 합: " + total);
	}
	
	

}
