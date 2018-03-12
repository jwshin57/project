package com.javaex.collection.list;

import java.util.Vector;

public class VectorEx02 {

	public static void main(String[] args) {
		Vector<? super Number> v = new Vector<>();
	
		v.addElement(1);
		v.addElement(new Integer(10));
		v.addElement(new Float(3.14159));
		
		// v.addElement(new String("Java"));
		
		System.out.println(v);
		
		
		
		
	}

}
