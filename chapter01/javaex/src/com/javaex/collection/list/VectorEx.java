package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		//	백터의 생성
		
		Vector<Integer> v = new Vector<>();
		//	size 와 용량 체크 
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		
		//	값을 담아봅시다
		for (int i = 1; i <= 10; i++ ) {
			v.addElement(i);
			//	= v.addElement (new Integer(i));
			
		}
		
		//	다시 Size와 용량 체크
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		v.addElement(11);
		//	다시 size 와 용량 체크 
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		//	자동으로 버퍼 확장
		
		// 	중간의 값 넣기
		v.insertElementAt(5, 7);	// 7번 인덱스에 5번 추가 .........
		//	백터 확인
		System.out.println(v);
		
		//	요소의 확인
		int val = v.elementAt(7);
		System.out.println(val);
		
		//	요소 인덱스 확인 
		
		System.out.println(v.indexOf(7));
		System.out.println(v.indexOf(0));	//	없는 값
		
		//	포함 여부 확인
		System.out.println(v.contains(10));
		System.out.println(v.contains(12));		//	없는 값
		
		//	요소의 삭제
		v.removeElement(10);	//	해당 값의 삭제
		v.removeElementAt(3);	//	해당 인덱스의 요소 삭제
		
		System.out.println(v);	//확인
		
		//	 Enumeration
		Enumeration<Integer> e = v.elements();
		
		while (e.hasMoreElements()) {
			Integer item = e.nextElement();
			System.out.println(item);
			
		}
		
		//비우기
		
		v.clear();
		System.out.println(v);
		
		
		
		
	}
	
}
