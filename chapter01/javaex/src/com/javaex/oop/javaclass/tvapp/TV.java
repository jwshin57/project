package com.javaex.oop.javaclass.tvapp;

public class TV {
	// 상수
	final static int MIN_VOLUME = 0;
	final static int MAX_VOLUME = 100;
	
	final static int MIN_CHANNEL = 0;
	final static int MAX_CHANNEL = 255;
	
	//	필드: 채널, 볼륨, 전원
	
	private int channel;
	private int volume;
	private boolean power;
	
	//	생성자
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		
	}
		
	//	상태 출력 메서드
	
	public void status() {
		if (power) {
			System.out.println("Power: on, Channel:" + channel + ", Volume:" + volume);
		}else {
			System.out.println("Power: off");
		}
	}

	//	전원 메서드: true면 on, flase면 off
	
	public void power(boolean power) {
		this.power = power;
		
	}
	
	//	채널 메서드: 숫자가 입력되면 직접 셋팅, 단 범위 내에서만

	public void channel(int channel) {
		if (channel >= MIN_CHANNEL && channel <=MAX_CHANNEL) {
			this.channel = channel;
		}
	}
	
	// 채널 메서드: true 면 up, false 면 down (오버로딩나옵니다~~~~)
	
	public void channel(boolean up) {
		channel += up ? 1: -1;
		//	범위 체크
		if (channel > MAX_CHANNEL) {
			channel = MAX_CHANNEL;
			
		}else if (channel < MIN_CHANNEL) {
			channel = MIN_CHANNEL;
			
		}
	}
	
	//볼륨 메서드 : 숫자 입력시 범위 안쪽이면 볼륨 설정
	
	public void volume(int volume) {
		if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			this.volume = volume;
			
		}
	}
	
	//	볼륨 메서드 : true 면 볼륨 up, flase 면 볼륨 down ( 오버로딩 )
	
	public void volume(boolean up) {
		volume += up ? 1: -1;
		//범위 체크
		
		if (volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		}else if (volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
			
		}
	}
	
	
}
