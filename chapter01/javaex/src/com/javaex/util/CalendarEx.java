package com.javaex.util;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// 캘린더 불러오기
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		custom.set(2012,  8, 24);	// 월은 0부터 시작함을 유의
		
		//	날짜를 받아와 봅시다!
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1; //	0부터 시작하니 1을 더해줘야
		int date = now.get(Calendar.DATE);
		
		
		//	출력해 봅시다~.
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n",
				year,
				month,
				date);
		
		//	날짜를 조작해 봅시다. 10년 뒤로 갈게요~
		Calendar future = Calendar.getInstance();
		future.add(Calendar.YEAR, 10); //	10년 뒤.........
		
		//출력해 봅시다.
		System.out.printf("10년후: %d년%d월%d일",
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH) + 1,
				future.get(Calendar.DATE));
		
		
		//  이 날은 무슨 요일 일까요?
		int dow = future.get(Calendar.DAY_OF_WEEK);
		//	요일은
		// 	SUNDAY == 1, ~SATURDAY == 7
		String dowStr;
		
		switch(dow) {
		case Calendar.SUNDAY:
			dowStr = "일요일";
			break;
		case Calendar.MONDAY:
			dowStr = "월요일";
			break;
		case Calendar.TUESDAY:
			dowStr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowStr = "목요일";
		case Calendar.FRIDAY:
			dowStr = "금요일";
		case Calendar.SATURDAY:
			dowStr = "토요일";
			break;
			default:
				dowStr = "?";
		}
		System.out.println(" 이날은 " + dowStr + " 입니다.");
		
				
			
		
		}
		
	}


