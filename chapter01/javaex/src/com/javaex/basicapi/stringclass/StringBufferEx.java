package com.javaex.basicapi.stringclass;

public class StringBufferEx {

	public static void main(String[] args) {
		//	스트링 버퍼의 생성
		StringBuffer sb = new StringBuffer();
		//	문자열 추가
		sb.append("this");
		sb.append(" is pencil");
		
		//	문자열 삽입 : insert
		sb.insert(7, " my");
		System.out.println(sb);
		
		// 문자열 교체 : replace
		
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		//	버퍼 크기 조정 :" setLength
		sb.setLength(10);
		System.out.println(sb);
		
		System.out.println();
		
		//	메소드 체이닝 
		String s = new StringBuffer("this")
				.append(" is")
				.append(" pencil")
				.insert(7, " my")
				.replace(8, 10, "your")
				.toString();
		System.out.println(s);
		
		
	}

}
