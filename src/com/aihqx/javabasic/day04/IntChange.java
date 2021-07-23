package com.aihqx.javabasic.day04;

public class IntChange {

	/**实现两个整数a , b 值的数据交换
	 */
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c ;
		System.out.println("a的初始值为 :"+a);
		System.out.println("b的初始值为 :"+b);
		c = a;
		a = b;
		b = c;
		System.out.println("交换后的 a :"+a);
		System.out.println("交换后的 b :"+b);
		
		
	}

}
