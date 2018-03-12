package com.javaex.collection.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class ClassRoom {
	//	필드
	private String subject;
	private String roomName;
	
	//	생성자
	public ClassRoom(String subject) {
		this.subject = subject;
		
	}
	
	public ClassRoom(String subject, String roomName) {
		this(subject);
		this.roomName = roomName;
		
	}
	
	//	문자열 Override : toString
	public String toString() { 
		String output = "Class(subject=" + subject +
				", roomName" + roomName + ")";
		return output;
		
	}
	
	//	hashCode 오버라이드
	public int hashCode() {
		return subject.hashCode();
		
	}
	
	//	equals 오버라이드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassRoom) {
			return obj.hashCode() == this.hashCode();
			
		}
		return super.equals(obj);
		
	}
	
}
public class HashTableEx {

	public static void main(String[] args) {
		Map<String, ClassRoom> map = new Hashtable<>();
		
	//	앱에 데이터 넣기
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("102", new ClassRoom("C", "R201"));
		map.put("301", new ClassRoom("C++", "R301"));
		map.put("401", new ClassRoom("Python", "R401"));
		map.put("501", new ClassRoom("C#", "R501"));
		
		//	앱의 내용을 확인해봅시다
		System.out.println(map);
		
		//	앱의 데이터 확인 
		System.out.println(map.get("301"));
		
		//	앱의 데이터 변경
		map.put("301", new ClassRoom("Data Science", "R301"));
		System.out.println(map.get("301"));
		
		//	앱의 데이터 삭제
		map.remove("301");
		System.out.println(map);
	
		//	키값이 있는지 확인
		System.out.println(map.containsKey("301"));
		System.out.println(map.containsKey("501"));
		
		//	값이 있는지 확인 
		System.out.println("Java Class?:" + map.containsValue(new ClassRoom("Java")));
		
		
	Iterator<String> iter = map.keySet().iterator();
	while (iter.hasNext()) { 
		ClassRoom room = map.get(iter.next());
		System.out.println(room);
	}
	
	
	}

}
