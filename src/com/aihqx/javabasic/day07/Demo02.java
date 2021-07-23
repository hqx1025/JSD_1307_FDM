package com.aihqx.javabasic.day07;

import java.util.Arrays;

/**
 * Arrays API
 *  toSting 
 */
public class Demo02 {
	public static void main(String[] args) {
		String[] names={"Tom", "Andy", "Jerry", "John"}; 
		//打印数组内容
		for(int i=0; i<names.length; i++){
			// i= 0 1 2 3 
			System.out.print(names[i]+",");
		}
		System.out.println(); 
		//简单的输出数组内容, 使用Arrays.toString()输出数组内容
		//  更加简洁方便
		// toString 将数组的内容连接为一个字符串
		String str = Arrays.toString(names);
		//"[Tom, Andy, Jerry, John]"
		System.out.println(str); 
		System.out.println(Arrays.toString(names));  
	}
}



