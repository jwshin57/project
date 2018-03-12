package com.javaex.io.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	static String rootDir = "D:\\javastudy\\files\\files";
	static String filename = rootDir + "\\thieves.txt";
	
	
	public static void main(String[] args) {
		File file = new File(filename);
		
		
		try {
			//scanner 선언`
			Scanner sc = new Scanner(file);
			String name;
			float height;
			float weight;
			
			while (sc.hasNextLine()) {
				name = sc.next();
				height = sc.nextFloat();
				weight = sc.nextFloat();
				
				System.out.println(name + ", 키:" + height + ", 체중:" + weight);
				sc.nextLine();
				
			}
		
		sc.close();
		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
