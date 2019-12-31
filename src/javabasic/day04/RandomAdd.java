package day04;

import java.util.Random;

public class RandomAdd {

	/**产生两个10以内的随机数，计算两个随机数相加的结果。
	 */
	public static void main(String[] args) {
		
		int a , b;
		int sum;
		Random random = new Random();
		a = random.nextInt(10);
		b = random.nextInt(10);
		System.out.println("随机数a的值为："+a);
		System.out.println("随机数b的值为："+b);
		sum = a + b;
		System.out.println("随机数 a + b 的和 sum ="+sum);

	}

}
