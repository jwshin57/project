package com.javaex.oop.javaclass.ex02.copy;

public class GoodsApp {

	public static void main(String[] args) {
		// 클래스명 이름 = new 클래스명();
		Goods camera = new Goods();
//		camera.name = "nikon";
//		camera.price = 400000;
		camera.setName("Nikon");
		camera.setPrice(400000);
		
		//출력
		camera.showInfo();
		
		Goods iphone = new Goods();
		iphone.setName("아이폰");
		iphone.setPrice(14200000);
		
		Goods galaxy = new Goods();
		galaxy.setName  ("갤럭시S8");
		galaxy.setPrice  (898000);
		
		iphone.showInfo();
		galaxy.showInfo();
		

	}

}
