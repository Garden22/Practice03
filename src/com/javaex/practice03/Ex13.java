package com.javaex.practice03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println("합계: " + sum);
		
		sc.close();
	}
}
