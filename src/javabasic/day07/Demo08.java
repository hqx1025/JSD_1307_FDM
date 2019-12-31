package day07;

import java.util.Arrays;

/**
 * 插入排序
 * 
 */
public class Demo08 {
	public static void main(String[] args) {
		int[] ary = { 12, 45, 2, 54, 12, 2 };
		Demo08.sort(ary);
		System.out.println(Arrays.toString(ary));

	}

	public static void sort(int[] ary) {
		int i, j, k;
		for (i = 1; i < ary.length; i++) {
			k = ary[i];
			for (j = i - 1; j >= 0 && ary[j] > k; j--) {
				ary[j + 1] = ary[j];
			}
			ary[j + 1] = k;
		}

	}

}
