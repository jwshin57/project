package com.javaex.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		//	선언
		List<String> l = new LinkedList<>();
		
		// 객체 추가
		l.add("Java");
		l.add("C");
		l.add("C++");
		l.add("Python");
		
		// 객체 삽입
		
		l.add(2, "C#");
		
		
		//	저장된 객체의 수 
		System.out.println(1);
		System.out.println("객체 수:" + l.size());
		
		//	객체의 삭제
		//	방법 1 : 노드 인덱스로 삭제
		l.remove(2);
		System.out.println(l);
		
		//	방법2 : 주어진 객체값을 찾아 삭제
		l.remove("Python");
		System.out.println(l);
		
		//Iterator
		Iterator<String> iter = l.iterator();
		while (iter.hasNext()) {
			String item = iter.next();
			System.out.println("item:" + item);
		}
		// 비우기
		l.clear();
		System.out.println(l);
		
		
		
	}

}
