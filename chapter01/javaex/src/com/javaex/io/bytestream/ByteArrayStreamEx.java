package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		//	원본 데이터와 타겟 배열
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, };
		byte[] outSrc = null;
		
		System.out.println(Arrays.toString(inSrc));
		
		try { 
			//	InputStream 과 OutputStream 열기 
			InputStream bis = new ByteArrayInputStream(inSrc);
			OutputStream bos = new ByteArrayOutputStream();
			
			int data = 0; 	//	InputStream으로부터 넘어올 데이터 저장
			
			while ((data = bis.read()) != -1) {
				//	읽을 데이터 없을 때는 -1
				System.out.println(data);
				bos.write(data);
				
			}
			
			outSrc = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println(Arrays.toString(outSrc));
			
			bos.close();
			bis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
