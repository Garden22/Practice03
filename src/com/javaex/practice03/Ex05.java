package com.javaex.practice03;

public class Ex05 {

	public static void main(String[] args) {

		int i = 1;
		boolean flag = true;
		
		while (flag) {   // while (true)와 동일 > i == 5가 되면 false
			if (i >= 5) {
				flag = false;
			}
			
			System.out.println(i); // i == 5여도 출력 한 뒤 while 조건에 걸림
			i = i+1;
		}
		
		/*
		 *  1
		 *  2
		 *  3
		 *  4
		 *  5 
		 */
		
	}
}
