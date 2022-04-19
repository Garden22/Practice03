package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int max = 0;
		
		System.out.println("숫자를 입력하세요");
		
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("숫자: ");
			num = sc.nextInt();
			
			if (i == 1) {
				max = num;
				
			} else {			
				if (num > max) {
					max = num;
				}
			}
		}
		
		System.out.println("최대값은 " + max + "입니다.");
		sc.close();
	}
}
