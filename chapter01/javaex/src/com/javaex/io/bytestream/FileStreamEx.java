package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	static String rootDir = "D:\\javastudy\\files\\files";
	static String srcFilename = rootDir + "\\img.jpg";
	static String destFilename = rootDir + "\\img_copy.jpg";
	public static void main(String[] args) {
		try { 
			InputStream is = new FileInputStream(srcFilename);
			OutputStream os = new FileOutputStream(destFilename);
			
			int data = 0;
			
			while ((data = is.read()) != -1) {
				os.write(data);
			}
			
			os.close();
			is.close();
			
			System.out.println("파일이 복사되었습니다.");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}

}
