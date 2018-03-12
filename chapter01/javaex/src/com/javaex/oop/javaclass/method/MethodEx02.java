package com.javaex.oop.javaclass.method;

public class MethodEx02 {

	public static void main(String[] args) {

		//	여러 개의 double을 합하는 메서드 작성 방법
		
		
		System.out.println(sumArray(new double[] { 1, 2, 3, 4, 5 }));
		
		System.out.println(sumMulti(1, 2, 3, 4, 5));
		
		printTotal("총 합은:", 1, 2, 3, 4, 5, 6, 7);
		
	}
	// static void example(double ...values, String message) {
		
	// }
	// printTotal(String message, double ... values)
		static void printTotal(String message, double ... values) {
		double total = 0;
		for (double val:values) {
			total += val;
		}
		
		System.out.println(message + " " + total);
		}
		
		static double sumMulti(double ... values) {
			double total = 0;
			for (double val:values) {
				total += val;
			}
			return total;
		}
	
		static double sumArray(double[] values) {
		double total = 0;
		for (double val: values) {
			total += val;
			
		}
		return total;
	}
	
}
