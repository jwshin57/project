package com.javaex.io.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static String rootDir = "D:\\javastudy\\files";
	static String filename = rootDir + "\\char.txt";
	
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter(filename);
			
			writer.write("Bit Computer\r\n");
			writer.write("Java Programming\r\n");
			writer.write("2018");
			
			writer.close();
			
			Reader reader = new FileReader(filename);
			
			int data = 0;
			
			while ((data = reader.read()) != -1) {
				System.out.println((char)data);
			}
			System.out.println();
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
	 