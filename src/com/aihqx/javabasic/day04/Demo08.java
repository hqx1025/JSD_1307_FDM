package com.aihqx.javabasic.day04;

import java.util.Scanner;

public class Demo08 {

	/**闰年的判断公式为：
	 * 1  年份能被4整除，且不能被100整除的是闰年
	 * 2  年份能被400整除的是闰年
	 */
	public static void main(String[] args) {
		boolean  isLeapYear;
		int year ;
		System.out.println("输入年份啊！！！！");
		Scanner in = new Scanner(System.in);
		year = in.nextInt();
		isLeapYear = (year%4==0 && year%100!=0)|| year%400==0;
		if(isLeapYear){
			System.out.println(year+"是闰年！");
		}else{
			System.out.println("不是闰年啊啊啊！！！！");
		}
		
		
	}

}
