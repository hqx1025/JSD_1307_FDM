package com.aihqx.javabasic.day03;

public class Precision {
	public static void main(String[] args){
		float fa = 5;
		float fb = 5;
		float fc = fa + fb;
		System.out.println(fa);
		System.out.println(fc);
		int a = 0x7fffffff;
		int b = 0x7ffffff0;
		System.out.println(a-b);
		// 损失精度
		fa = a;
		fb = b;
		System.out.println("a =  "+a);
		System.out.println("b =  "+b);
		System.out.println("fa=  "+fa);
		System.out.println("fb=  "+fb);
		System.out.println("fa-fb= "+(fa-fb)+"     说明float精度不高有误差");
		System.out.println("a+b= "+(a+b)+"       超过int范围发生溢出了");
		System.out.println("fa+fb= "+(fa+fb)+"     float范围比int大");
		
		double da = a;
		double db = b;
		System.out.println(da-db);
		System.out.println(da+db);
		double pi = 3.1415926535897932384;
		//float f =  3.1415926535897932384; 编译错误
		//double 字面量不能赋值给float
		
		float f = 3.1415926535897932384F;
		System.out.println(pi);
		System.out.println(f);
		
	}

}
