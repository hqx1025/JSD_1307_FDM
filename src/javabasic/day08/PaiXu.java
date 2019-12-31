package day0x1;

import java.util.Arrays;

public class PaiXu {

	/**
	 * 插入排序 and 冒泡排序 Go！
	 */
	public static void main(String[] args) {
		int[] ary = { 45, 6, 1, 4, 5, 463, 2 };

		PaiXu.chaRu(ary);
		System.out.println("插入排序为：" + Arrays.toString(ary));
		PaiXu.maoPao(ary);
		System.out.println("冒泡排序为：" + Arrays.toString(ary));

	}

	public static void chaRu(int[] ary) {
		int i, j, k;
		for (i = 1; i < ary.length; i++) {
			k = ary[i];
			for (j = i - 1; j >= 0 && ary[j] > k; j--) {
				ary[j + 1] = ary[j];
			}
			ary[j + 1] = k;
		}

	}

	public static void maoPao(int[] ary) {
		for (int i = 0; i < ary.length - 1; i++) {
			for (int j = 0; j < ary.length - i - 1; j++) {
				if (ary[j] > ary[j + 1]) {
					int t = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = t;
				}

			}

		}

	}

}
