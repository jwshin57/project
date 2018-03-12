package com.javaex.network.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		//	서버 소켓 선언 
		ServerSocket serverSocket = null;
		
		try {
			//	서버 소켓을 생성
			serverSocket = new ServerSocket();
			//	바인드 
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 10001));
			
			//	시작 메시지
			System.out.println("<서버시작>");
			System.out.println("[연결을 기다립니다.]");
			
			//	접속을 기다린다
			Socket socket = serverSocket.accept();	//	대기
			
			//	클라이언트가 접속되었을 때의 처리
			InetSocketAddress client = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[클라이언트가 연결되었습니다.]");
			System.out.println(client.getAddress() + ":" + client.getPort());
			
			//	종료 메시지
			System.out.println("<서버 종료>");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		}finally {
			try { 
				serverSocket.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}








