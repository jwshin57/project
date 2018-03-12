package com.javaex.oop.javaclass.tvapp;

public class TVApp {

	public static void main(String[] args) {
		TV tv = new TV( 7, 20, false);
		// 생성자: 채널, 볼륨, power
		
		tv.power(true);		//power 메서드 true면 켬, false면 끔
		
		tv.volume(30);
		tv.volume(true);
		// 숫자면 직접 설정, true면 볼륨 up, false면 down
		
		tv.status();
		//상태값 출력
		
		tv.channel(11);
		tv.channel(false);
		// 숫자면 직접 채널 설정, true면 채널up, false면 down
		tv.status();
		
		tv.power(false);	//	TV 끄기
		tv.status();
		
		
		
		
	}

}
