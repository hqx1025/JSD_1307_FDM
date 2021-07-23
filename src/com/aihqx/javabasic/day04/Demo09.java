package com.aihqx.javabasic.day04;

import java.util.Scanner;

public class Demo09 {

	/**
	 */
	public static void main(String[] args) {
		int a,b,c,max;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入a,b,c用空格隔开：");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		max = a;
		if(b>max){
			max = b;
		}
		if(c>max){
			max = c;
		}
		System.out.println("最大值是："+max);
	}

}
