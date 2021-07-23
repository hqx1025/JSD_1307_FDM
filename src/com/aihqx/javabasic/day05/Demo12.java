package com.aihqx.javabasic.day05;

import java.util.Scanner;

public class Demo12 {

	/**while 循环
	 * 
	 * while (循环条件(布尔表达式)(1)){
	 *       //循环体(2)
	 *       }
	 *   (3)
	 *   while 的执行流程
	 *   {(1)-true ->(2)} -->{(1)-true ->(2)} ->
	 *   
	 *   while  循环一般用在与次数无关的循环
	 *       案例：保证控制台输入的分数在0～100之间
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = -1;
		while(score <0 || score>100){
			System.out.println("输入分数(0~100):");
			score = in.nextInt();
		}
		System.out.println("分数:"+score);
		
		int a = 10;
		while(true){
		
			a--;
			if(a==5)
				break;
		}
		System.out.println(a);
	}


}
