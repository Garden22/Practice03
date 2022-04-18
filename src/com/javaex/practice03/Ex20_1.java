package com.javaex.practice03;

import java.util.Scanner;

public class Ex20_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		String exit;
		
		
		while (true) {   // while문 1) 게임 창. 종료하겠습니다 y 입력해야 break
			System.out.println("==========================");
			System.out.println("     [숫자맞추기게임 시작]");
			System.out.println("==========================");
			
			int num = (int)(Math.random()*100)+1; // 1에서 100 사이의 난수
			
			System.out.println("1 ~ 100 사이의 수를 입력하세요.");
			
			
			while (true) {   // while문 2) 한 게임. 숫자 맞춰야 break
				System.out.print(">> ");
				input = sc.nextInt();
				
				if (input == num) {
					System.out.println("맞았습니다.");
					break;
					
				} else if (input < 1 || input > 100) {
					System.out.println("잘못 입력했습니다.");
					
				} else if (input < num) { 
					System.out.println("더 높게");
				
				} else {
					System.out.println("더 낮게");
				}	
			} // while문 2 종료
			
			
			System.out.println("게임을 종료하시겠습니까? (y/n) >> ");
			sc.nextLine();   // 개행문자 제거
			exit = sc.nextLine();
						
			if (exit.equals("y")) {
				System.out.println("==========================");
				System.out.println("     [숫자맞추기게임 종료]");
				System.out.println("==========================");
				break;
			}
		} // while문 1 종료
		
		sc.close();
		
	}

}
