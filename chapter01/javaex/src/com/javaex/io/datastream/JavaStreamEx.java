package com.javaex.io.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaStreamEx {
	static String rootDir = "D:\\javastudy\\files\\files";
	static String filename = rootDir + "\\primitives.txt";
	
	public static void main(String[] args) {
	try {
		//	주 스트림
		FileOutputStream os = new FileOutputStream(filename);
		//	보조 스트림
		DataOutputStream dos = new DataOutputStream(os);
		
		dos.writeUTF("홍길동");
		dos.writeBoolean(true);
		dos.writeInt(23);
		dos.writeFloat(80.5f);
		
		dos.writeUTF("전우치");
		dos.writeBoolean(false);
		dos.writeInt(25);
		dos.writeFloat(59.3f);
		
		dos.close();
		
		FileInputStream is = new FileInputStream(filename);
		DataInputStream dis = new DataInputStream(is);
		
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			boolean b = dis.readBoolean();
			int val = dis.readInt();
			float f = dis.readFloat();
			
			System.out.println(name + ":" + b + ":" + val + ":" + f);
			
		}
		dis.close();
		
					
	} catch (FileNotFoundException e) {
		
	} catch (IOException e) {
	
		
	}
	}
}

