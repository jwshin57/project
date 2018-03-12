package com.javaex.language.condition;

public class SwitchEx02 {

	public static void main(String[] args) {
		char grade = 'b';
		String message;
		
		switch(grade){
		case 'A':
		message = "Excellent";
		break;
		
		case 'B':
		case 'C':
			message = "Good";
			break;
			
		case 'D':
			message ="pass";
			break;
		case 'F':
			message = "try again";
			break;
			default:
				message = "?";
				
		}
		System.out.println(message);
		
		

	}

}
