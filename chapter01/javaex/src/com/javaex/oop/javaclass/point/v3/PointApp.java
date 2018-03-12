package com.javaex.oop.javaclass.point.v3;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(5, 5);
		//출력 draw 메서드 호출
		p1.draw();
		p1.draw(false);
		
		Point p2 = new Point(10, 15);
		
		p2.draw();
		p2.draw(false);
		
		
		
	}

}
