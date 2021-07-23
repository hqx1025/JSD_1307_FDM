package com.aihqx.javabasic.day04;

public class Demo02 {

	/**取余运算，取模运算
	 * 获取除法结果中的
	 */
	public static void main(String[] args) {
		int n = 5;
		int m = n % 3;  //得1余2
		System.out.println(m); //2
		
		System.out.println(-4%3);// 得 -1 余 -1
		System.out.println(-3%3); //  -1    0
		System.out.println(-2%3); //   0    -2
		System.out.println(-1%3); //   0    -1
		System.out.println(0%3); //    0     0
		System.out.println(1%3); //    0     1
		System.out.println(2%3); //    0     2
		System.out.println(3%3);//     1     0
		System.out.println(4%3); //    1     1
		System.out.println(5%3); //    1     2
		System.out.println(6%3); //    2     0
		System.out.println(4%-3); //   -1    1
		System.out.println(-4%-3);
	}

}
