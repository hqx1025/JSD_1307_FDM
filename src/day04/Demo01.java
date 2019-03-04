package day04;

import java.util.Scanner;

public class Demo01 {

	/**
	 * 类型转换
	 */
	public static void main(String[] args) {
		//实验目的，观察java自动的将byte转换为int
		byte b =-1;
		//隐式类型转换，自动转换
		//Integer.toHexString()将整形转换为16进制字符串
		System.out.println(Integer.toHexString(b));
		
		
		
//		
//		 Scanner scanner = new Scanner(System.in);
//         System.out.println("符号函数sgn（x）");
//         System.out.println("请输入x的值（double）");
//         double x = scanner.nextDouble();
// // 此语句意义何在？(  )
//         int sgn = x > 0 ? 1 : (x < 0 ? -1 : 0);
//         System.out.println("sgn(" + x + ")=" + sgn);
         double s = 10463.68;
         s = Math.round(10 * s) / 10.0;
         System.out.println(s);
                       
	}

}
