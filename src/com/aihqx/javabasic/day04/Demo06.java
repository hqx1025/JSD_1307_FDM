package com.aihqx.javabasic.day04;

public class Demo06 {

	/**
	 */
	public static void main(String[] args) {
		int a;
		a = 1;
		a += 2;
		System.out.println(a);
		a = 2;
		a *= 4;
		System.out.println(a);
		//将一个整数，按照10进制每个数字拆开
		int sum = 0;
		int num = 34678;
		int last = num %10;
		sum = sum * 10 +last;
		System.out.println(last);
		num /= 10;
		last = num%10;
		sum = sum * 10 +last;
		System.out.println(last);
		num /= 10;
		last = num%10;
		sum = sum * 10 +last;
		System.out.println(last);
		num /= 10;
		last = num%10;
		sum = sum * 10 +last;
		System.out.println(last);
		num /= 10;
		last = num%10;
		sum = sum * 10 +last;
		System.out.println(last);
		
		
	}

}
