package com.aihqx.javabasic.day07;

import java.util.Arrays;

public class Demo09 {

	public static void main(String[] args) {
		int[] ary = { 453, 4, 3, 54, 35, 4 };
		Demo09.sort(ary);
		System.out.println(Arrays.toString(ary));
	}

	public static void sort(int[] ary) {
		for (int i = 0; i < ary.length - 1; i++) {
			for (int j = 0; j < ary.length - i - 1; j++) {
				if (ary[j] > ary[j + 1]) {
					int t = ary[j + 1];
					ary[j + 1] = ary[j];
					ary[j] = t;
				}
			}

		}

	}

}
