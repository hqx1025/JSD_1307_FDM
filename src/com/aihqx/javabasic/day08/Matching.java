package com.aihqx.javabasic.day08;
public class Matching {
	public static void main(String[] args) {
		int[] arrOne = { 2, 1, 4, 5, 6 };
		int[] arrTwo = { 2, 4, 7, 1, 6 };
		String str = match(arrOne, arrTwo);
		System.out.println(str);
	}

	/**
	  实现匹配游戏算法

在两个数组中，索引相同且该相同索引上的值也相同，用a表示。

在两个数组中，索引不同且该不同索引上的两个值相同，用b表示。

例：

int[] arrOne = { 2, 1, 4, 5, 6 };

int[] arrTwo = { 2, 4, 7, 1, 6 };

以上数组中有2个a， 2个b
	 */
	public static String match(int[] arrOne, int[] arrTwo) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < arrOne.length; i++) {
			for (int j = 0; j < arrTwo.length; j++) {
				if (i == j && arrOne[i] == arrTwo[j]) {
					a++;
				} else if (i != j && arrOne[i] == arrTwo[j]) {
					b++;
				}
			}
		}
		return "a=" + a + ",b=" + b;
	}
}