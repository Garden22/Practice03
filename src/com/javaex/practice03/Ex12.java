package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		// int 범위 넘어서는 결과값이면 이상하게 출력됨.. long type으로 바꾸거나 입력하는 숫자 제한해야함

		Scanner sc = new Scanner(System.in);
		int answer = 1;
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			answer *= i;
		}
		
		System.out.println("결과값: " + answer);
		
		sc.close();
	}
}
