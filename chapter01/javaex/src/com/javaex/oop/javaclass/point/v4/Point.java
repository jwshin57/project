package com.javaex.oop.javaclass.point.v4;

public class Point {
		protected int x;
	 	protected int y;
	 
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
	 	
	 	//메서드 오버로딩
	 	void draw(boolean show) {
	 		String message = "점[x=" + x + ",y" + y +"]을";
	 		if (show) {
	 			message += "그렸습니다.";
	 		}else {
	 			message += "지웠습니다.";
	 		}
	 		System.out.println(message);
	 		
	 		}
	 	}
	
 	


