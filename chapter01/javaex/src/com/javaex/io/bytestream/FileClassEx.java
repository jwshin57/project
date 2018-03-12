package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String dirName = "D:\\javastudy";

	public static void main(String[] args) {
		File root = new File(dirName);
		
		//	내용 출력
		printInfo(root);
		
		//	새 파일을 만들자~
		File file = new File(dirName + "\\myfile.txt");
		//	아직 파일이 만들어진 것은 아닙니다.
		
		//	파일을 만들어 봅시다
		if (!file.exists()) {
			try {
				file.createNewFile();
				
			} catch (IOException e) {
				System.out.println("파일을 만들지 못했습니다");
			}
		}
		printInfo(root);
		
		file.delete();	//	파일 지우기
		printInfo(root);
		
		
	}
	//	메서드 printInfo
	static void printInfo(File f) {
		System.out.println("--------------");
		
		if (f.isDirectory()) {	// 	디렉토리인지 확인
			System.out.println("Directory:" + f.getName());
			//	디렉토리 내 파일 목록 받아오기 
			File[] files = f.listFiles();
			for (File file:files) {
				System.out.print(file.isDirectory() ? "d": "f ");
				System.out.print(file.getName());
				System.out.println();
				
			}
			
		}else {
			System.out.println("File:" + f.getName());
		}
		System.out.println("------------");
		
	}
}
