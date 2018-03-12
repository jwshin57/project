package com.javaex.basicapi.arrays;

import java.util.Arrays;

public class SeacrchEx {

	public static void main(String[] args) {
		//	기본형 검색 
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int index = Arrays.binarySearch(nums, 7);
		System.out.println("인덱스:" + index);
		
		
		//	문자열 혹은 참조형 검색 
		String[] str = {"Java", "C", "C++","Python"};
		index = Arrays.binarySearch(str, "C++");
		System.out.println("인덱스:" + index);
		
		index = Arrays.binarySearch(str, "C#");
		System.out.println("인덱스:" + index);
		
		
		}
	}


