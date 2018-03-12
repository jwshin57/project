package com.javaex.oop.javaclass.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// 클래스명 이름 = new 클래스명();
		Goods camera = new Goods();
		camera.name = "nikon";
		camera.price = 400000;
		
		
		//출력
		System.out.printf("Name: %s, price: %d%n", camera.name, camera.price);
		
		Goods iphone = new Goods();
		iphone.name = "아이폰";
		iphone.price = 1420000;
		
		Goods galaxy = new Goods();
		galaxy.name = "갤럭시S8";
		galaxy.price = 898000;
		
		System.out.printf("Name: %s, price: %d%n", iphone.name, iphone.price);
		
		System.out.printf("Name: %s, price: %d%n", galaxy.name, galaxy.price);

	}

}
