package com.aihqx.javabasic.day03;

public class InitVar {
	public static void main(String[] args){
		//利用字面量5初始化i
		int i = 5;
		byte b;
		b = 5;
		//b = 128;  编译错误 超出范围
		b = -128;
		//b = i;  整型不能赋值给byte
		
		System.out.println(0xffffff80);
		System.out.println(0x80);
		
		//b = 0x80;  编译出错 128
		b = 0x7f;
		//-128
		b = 0xffffff80;
		//b = 0xffffff7f; 编译出错 ，超过范围 -129
		System.out.println(b);
		
		short s = 0xffff8000;
		System.out.println(s);
		
		//int x = 080; 编译出错  8进制没有8！
		
		int max = 0x7fffffff;

		//超出范围溢出
		int a = max * 2+2;

		System.out.println(a);
		System.out.println(Integer.toString(0xfffffffb, 10));
		
		
		
	}

}
