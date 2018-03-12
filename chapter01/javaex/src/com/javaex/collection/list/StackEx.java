package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//	선언
		Stack<Integer> st = new Stack<>();
		
		//	스택에 값 넣기
		for (int i = 0; i < 10; i++) {
			//담기: push
			st.push(i);
			
		}
		
		System.out.println(st);
		//	꺼내기 : pop
		int val = st.pop();
		System.out.println("pop:" + val);
		System.out.println(st);
		
		
		//	peek도 해 봅시다~!~!
		val = st.peek();
		System.out.println("peek:" + val);
		System.out.println(st);
		
		//	아래 내용은 EmptyException 발생 
//		while(true) {
//			System.out.println(st.pop());		
//		}
		while(!st.empty()) {
			System.out.println(st.pop());
			
		}
	}

}
