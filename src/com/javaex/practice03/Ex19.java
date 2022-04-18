package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum, money, select;
		sum = 0;
		
		
		while (true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-----------------------------");

			System.out.print("선택>");
			select = sc.nextInt();
			
			if (select == 1) {
				System.out.print("예금액> ");
				money = sc.nextInt();
				sum += money;
				
			} else if (select == 2) {
				System.out.print("출금액> ");
				money = sc.nextInt();
				sum -= money;
				
			} else if (select == 3) {
				System.out.print("잔고액> ");
				System.out.println(sum);
				
			} else if (select == 4) {
				System.out.println("프로그램 종료");
				break;
				
			} else {
				System.out.println("다시입력해주세요");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
