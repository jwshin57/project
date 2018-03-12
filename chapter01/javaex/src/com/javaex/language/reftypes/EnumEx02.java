package com.javaex.language.reftypes;

public class EnumEx02 {

	public static void main(String[] args) {
		Week today = Week.MONDAY;
		
		System.out.printf("Today is %s(%d)%n",
				today.name(),
				today.ordinal());
			
		
			//SATURDAY 값과의 차이 비교해 봅시다
		System.out.println
		(today.compareTo(Week.SATURDAY));

		
		// Week 내의 모든 객체를 가져오기
		Week[] week = Week.values();
		for (int i = 0; i < week.length; i++) {
			System.out.printf("%s = %d%n",
					week[i].name(),
					week[i].ordinal());
		}
		
		Week obj = Week.valueOf("SUNDAY");
		System.out.printf("%s(%d)%n",
				obj.name(),
				obj.ordinal());
				
				
		
		
		
		}

}
