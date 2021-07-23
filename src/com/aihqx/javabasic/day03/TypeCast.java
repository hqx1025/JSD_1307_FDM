package com.aihqx.javabasic.day03;

public class TypeCast {

	public static void main(String[] args) {
		//自动类型转换  也称为 隐式类型转换
		int i = -1;
		//是64位 发生符号位扩展现象
		long l = i;
		System.out.println(l);
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
        //Long.toBinaryString 方法的参数是long类型
		//在i向long 类型参数传递时候发生了自动类型转换！
		
		System.out.println(Long.toBinaryString(i));
		byte b =-1;
		System.out.println(Integer.toBinaryString(b));
		b = 5;
		System.out.println(Long.toBinaryString(b));
    
    
	}

}
