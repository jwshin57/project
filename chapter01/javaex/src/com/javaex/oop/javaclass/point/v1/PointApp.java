package com.javaex.oop.javaclass.point.v1;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		//출력 draw 메서드 호출
		p1.draw();
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(15);
		p2.draw();
		
		
		
	}

}
