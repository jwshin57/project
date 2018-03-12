package com.javaex.oop.javaclass.reference;

class Seller {

	int pCount = 100;		// 상품개수
	int money = 0;			// 돈
	final int PRICE = 1000;	// 가격
	
	
	//	saleProduct(int money)
	int saleProduct(int money) {
		int num = money / PRICE;
		pCount -= num;
		this.money += money;
		return num;
	}
	//	showStatus()
	void showStatus() {
		System.out.println("Seller");
		System.out.println("재고:" + pCount);
		System.out.println("수익금: " + money);
	}
	
}

class Buyer {
	// 필드 money, pCount
	int money = 10000;
	int pCount = 0;
	
	//buyProduct(Seller, money)
	void buyProduct(Seller seller, int money) {
		pCount += seller.saleProduct(money);
		this.money -= money;
		
	}
	// showStatus()
	void showStatus() {
		System.out.println("Buyer");
		System.out.println("상품: " + pCount);
		System.out.println("잔액: " + money);
		
	}
}

public class SellAndBuy {

	public static void main(String[] args) {
		Seller seller = new Seller();
		Buyer buyer = new Buyer();
		
		seller.showStatus();
		buyer.showStatus();
		
		buyer.buyProduct(seller, 3000);
		
		seller.showStatus();
		buyer.showStatus();
		

	
	
	
	}

}
