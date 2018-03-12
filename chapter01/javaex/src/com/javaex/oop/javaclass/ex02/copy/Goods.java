package com.javaex.oop.javaclass.ex02.copy;

	public class Goods {
				//필드의 선언
	private	String name;
	private	int price;
	
	// name의 getter / setter 
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() { 
		return this.name;
	}
	
	// price의 getter / setter 
	
	void setPrice(int price) {
		this.price = price;
	}
	
	int getPrice() { 
		return this.price;
		
	}
	void showInfo() {
		System.out.println("상품명:" + name);
		System.out.println("가격: " + price);
	}
}
	
