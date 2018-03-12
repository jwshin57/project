package com.javaex.collections.generic.ex03;

public class Box<K, V> {
		K key;
		V content;
		
		//	getter / setter 
		public K getKey() {
			return key;
			
		}
		public void setKey(K key) {
			this.key = key;
			
		}
		
		public V getContent() {
			return content;
		}
		
		public void setContent(V content) {
			this.content = content;
		}
		
	
	}


