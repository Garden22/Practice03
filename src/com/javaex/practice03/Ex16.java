package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0) {
				sum += 1;
				count += i;	
				
			}
		}
		
		System.out.println("5의 배수의 합: " + sum);
		System.out.println("5의 배수의 개수: " + count);
		
		sc.close();

	}

}
