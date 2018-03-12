package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		//	내 컴퓨터의 IP 주소
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Local IP Address:" + local.getHostAddress());
			
			//원격지 서버 주소 얻기
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress remote:iaArr) {
				System.out.println("www.naver.com IP:" + remote.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
		
	}

}
}
