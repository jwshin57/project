package com.javaex.solo;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;  	//입력받는값
		int money = 0;	//은행에 입금할 금액이나 출금할 금액
		int bank = 0;	//저장된 금액
		
		while(true) 	
		{
			System.out.println("----------------");
			System.out.println("1.예금  2.출금  3.잔금  4.종료");
			System.out.println("----------------");
			
			System.out.println("선택>");
			num = sc.nextInt();
			
			if (num == 1)
			{
				System.out.println("예금액>");
				money = sc.nextInt();
				bank = bank + money;
			}
			else if (num == 2)
			{
				System.out.println("출금액>");
				money = sc.nextInt();
				bank = bank - money;
			}
			else if (num==3)
			{
				System.out.println("잔고>" + bank);
				
			}
			else if (num == 4)
			{
				System.out.println("종료");
				break;
				
			}else
			{
				System.out.println("다시입력해주세요");
			}
		
		
		}sc.close();
		
	}

}
