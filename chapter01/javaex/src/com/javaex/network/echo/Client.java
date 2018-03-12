package com.javaex.network.echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
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
			socket.connect(new InetSocketAddress("127.0.0.1", 10001)); 	// 	대기
			
			//	접속 되었을 때의 처리
			System.out.println("[서버에 연결되었습니다.]");
			
			OutputStream os = socket.getOutputStream();					//	주 스트림
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			
			//	메시지 받기 스트림
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//	키보드 입력 스트림
			BufferedReader keyReader = new BufferedReader(
					new InputStreamReader(System.in));
			
			while(true) {
				String msg = keyReader.readLine();
				
				if (msg.equals("/q")) {
					System.out.println("[접속을 종료합니다]");
					break;
				}
			//	송신부
			bw.write(msg);
			bw.newLine();
			bw.flush();
			System.out.println("송신메시지:" + msg);
			
			//	수신부
			String rcvMsg = br.readLine();
			System.out.println("수신메시지:" + rcvMsg);
			
			}
			
			keyReader.close();
			bw.close();
			br.close();
			
			
			System.out.println("<클라이언트 종료>");
			// 	접속이 안되었을 때의 처리
		} catch (ConnectException e) {
			System.out.println("접속이 거부되었습니다.");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close(); 			//소켓 닫기			
			} catch (IOException e) {
				System.out.println(e.getMessage());
				
			}
		}
		
		
	}

}
