package com.javaex.solo02;

public class Ex03 {

	public static void main(String[] args) {
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		System.out.println(c);
		
		for(int i = 0; i<c.length; i++) {
			if (c[i] == ' ') {
				c[i] = ',';
			}
				
		}
			System.out.println(c);
	}
}
