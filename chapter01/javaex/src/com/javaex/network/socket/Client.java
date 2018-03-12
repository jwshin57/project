package com.javaex.network.socket;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		//	소켓 선언 
		Socket socket = null;
		
		try {
			//	소켓 생성 
			socket = new Socket();
			//	시작 메시지
			System.out.println("<클라이언트 시작>");
			System.out.println("[연결을 요청합니다.]");
			
			//	서버 연결 시도
			socket.connect(new InetSocketAddress("127.0.0.1", 10001)); // 	대기
			
			//	접속 되었을 때의 처리
			System.out.println("[서버에 연결되었습니다.]");
			System.out.println("<클라이언트 종료>");
			// 	접속이 안되었을 때의 처리
		} catch (ConnectException e) {
			System.out.println("접속이 거부되었습니다.");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close(); 	//소켓 닫기			
			} catch (IOException e) {
				System.out.println(e.getMessage());
				
			}
		}
		
		
	}

}
