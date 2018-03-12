package com.javaex.oop.javaclass.point.v2;

public class Point {
		private int x;
	 	private int y;
	 
	 	//생성자
	 	public Point() {
	 		
	 	}
	 	
	 	public Point(int x, int y) {
	 		this.x = x;
	 		this.y = y;
	 	}
//	 	void setX(int x) {
//	 		this.x = x; 
//	 	}
	 	
	 	int getX() {
	 		return x;
	 	}
	 	
//	 	void setY(int y) {
//	 		this.y = y;
//	 	}
	 	
	 	int getY() {
	 		return y;
	 		
	 	}
	 	//출력 메서드
	 	void draw() {
	 		System.out.println("점[x=" + x + ",y=" + y + "]을 그렸습니다.");
	 	}
	
} 	


