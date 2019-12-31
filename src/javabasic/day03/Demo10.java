package day03;

import java.util.Random;


public class Demo10 {

	/**
	 * 随机生成A～Z的某个字符
	 */
	public static void main(String[] args) {
		char x;
		Random random = new Random();
		int n = random.nextInt(26);
		
		x = (char)('A'+n);
		System.out.println(n);
		System.out.println(x);


	}

}
