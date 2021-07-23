package com.aihqx.javabasic.day05;

import java.util.Scanner;

public class zhishu {

	/**
	 * 输出指定范围内的质数
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入质数范围的开始start(大于1的整数):");
		int start = scanner.nextInt();
		System.out.println("请输入质数范围的结束over(大于start的整数):");
		int over = scanner.nextInt();
		boolean zhishu;
		System.out.println(start + "到" + over + "范围内的质数为:");
		for (int i = start; i <= over; i++) {
			zhishu = true;
			for (int j = 2; j < i / 2; j++) {

				if (i % j == 0) {
					zhishu = false;
					break;
				}

			}

			if (zhishu)

				System.out.print(i + "\t");
		}

	}

}
