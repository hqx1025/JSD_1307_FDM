package com.aihqx.javabasic.day07;

import java.util.Arrays;
/**
 * Arrays 的 排序算法
 */
public class Demo04 {
	public static void main(String[] args) {
		int[] score = {67, 49, 88, 69, 95};
		Arrays.sort(score);//小 -> 大
		System.out.println(Arrays.toString(score));  
		String[] names = {"Tom", "Jerry", "Andy", "John"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		//使用null 填满 names 
		Arrays.fill(names, "hu");
		System.out.println(Arrays.toString(names));
		
	}
}


