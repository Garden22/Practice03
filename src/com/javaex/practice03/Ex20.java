package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 29;
		int input;
		String exit;
		
		while (true) {
			System.out.println("==========================");
			System.out.println("     [숫자맞추기게임 시작]");
			System.out.println("==========================");
			
			while (true) {
				System.out.print(">> ");
				input = sc.nextInt();
				
				if (input == num) {
					System.out.println("맞았습니다.");
					break;
					
				} else if (input < num) {
					System.out.println("더 높게");
					
				} else {
					System.out.println("더 낮게");
					
				}	
			}
			
			System.out.println("게임을 종료하시겠습니까? (y/n) >> ");
			sc.nextLine();
			exit = sc.nextLine();
						
			if (exit.equals("y")) {
				System.out.println("==========================");
				System.out.println("     [숫자맞추기게임 종료]");
				System.out.println("==========================");
				break;
			}
		}
		
		sc.close();
		
	}

}
