package com.javaex.practice03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		
		for (int i = 0; i < num; i++) {  // 숫자 하나씩 줄여가면서 출력(별 한개까지)
			for (int j = num-i; j > 0; j--) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		
		for (int i = 2; i <= num; i++) { // 숫자 하나씩 늘려가면서 출력(별 두개부터 num개까지)
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

		sc.close();
	}
}
