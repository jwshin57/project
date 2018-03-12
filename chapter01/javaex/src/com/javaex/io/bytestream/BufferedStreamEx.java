package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	static String rootDir = "D:\\javastudy\\files\\files";
	static String srcFilename = rootDir + "\\img.jpg";
	static String destFilename = rootDir + "\\img_buffered_copy.jpg";
	public static void main(String[] args) {
		try {
			//	주 스트림
			
			InputStream is = new FileInputStream(srcFilename);
			OutputStream os = new FileOutputStream(destFilename);
			
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			byte[] data = new byte[10240];
			int size = 0;
			
			while((size = bis.read(data)) != -1) {
				bos.write(data);
				System.out.println(size + "바이트를 복사했습니다.");
			}
			
			bos.close();
			bis.close();
			
			
			System.out.println("파일이 복사되었습니다.");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
		
	}

}
