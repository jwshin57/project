package com.javaex.language.condition;

public class MiniLotto {

	public static void main(String[] args) {
		//While 문 버전 
		int i = 0; //인덱스 변수를 0으로 셋팅
		while( i < 6) {
			int rnd = (int)(Math.random() * 45) + 1;
			System.out.println(rnd + " ");
			i++;
		} // for문 버젼
		System.out.println();
		
		for (int x = 0; x < 6; x++) {
			int rnd = (int)(Math.random() * 45) + 1;
			System.out.println(rnd + " ");
	}
		System.out.println();
}

}