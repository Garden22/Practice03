package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int answer = 0;
		
		if (num % 2 == 0) {
			for (int i = 2; i <= num; i += 2) {
				answer += i;
			}
			
		} else {
			for (int i = 1; i <= num; i += 2) {
				answer += i;
			}
		}
		
		System.out.println("결과값: " + answer);
		sc.close();
	}

}
