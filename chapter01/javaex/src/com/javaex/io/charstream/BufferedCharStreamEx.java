package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCharStreamEx {
	static String rootDir = "D:\\javastudy\\files\\files";
	static String srcFilename = rootDir + "\\last-leaf.txt";
	static String destFilename = rootDir + "\\last-leaf-filetered.txt";
	public static void main(String[] args) {
		try {	
		// 	주 스트림
		FileReader fr = new FileReader(srcFilename);
		FileWriter fw = new FileWriter(destFilename);
		
		// 	보조 스트림
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//	데이터 받을 String 변수
		String line = "";
		while ((line = br.readLine()) != null) {
			//	필터링
			if(line.toLowerCase().contains("leaf") ||
			   line.toLowerCase().contains("leaves")) {
		       System.out.println(line);
		       bw.write(line);
		       bw.write("\r\n");
		       
			}
					
		}
		bw.close();
		br.close();
		
		
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			System.out.println(e.getMessage());
	}
	}
}
