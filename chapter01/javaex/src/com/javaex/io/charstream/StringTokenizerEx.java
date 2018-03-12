package com.javaex.io.charstream;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String tel = "010-1234-5678";
		
		StringTokenizer st = new StringTokenizer(tel, "-");
		
		
		//	token들의 확인
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
