package com.javaex.util;

import java.text.DateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		//	객체 생성
		Date now = new Date();
		
		String nowStr = now.toString();
		System.out.println(nowStr);
		System.out.println(now.toLocaleString());	//	deprecated!!
		System.out.println();
		
		//	날짜를 FULL, LONG, MEDIUM, SHORT, 형식으로 출력
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(now));
		
		
	}

}
