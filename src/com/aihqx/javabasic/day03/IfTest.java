package com.aihqx.javabasic.day03;

public class IfTest {
	public static void main(String[] args){
		int age =18;
		boolean isChild = age < 16;
		//这个结果表示: 不是小孩
		System.out.println(isChild);
		// 爷们吗？ 纯爷们
		boolean isMan = true;
		// 用过， 二手
		boolean used = true;
		// 暂停
		boolean pause = false;
		//这个没有意义!
		boolean f = true;
		
		if(pause){
			System.out.println("输出了就是真");
		}else{
			System.out.println("这个输出了就是假");
		}
		if(used){
			System.out.println("True");
		}
		
		
	}

}
