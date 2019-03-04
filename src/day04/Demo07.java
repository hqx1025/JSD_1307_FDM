package day04;

import java.util.Scanner;

public class Demo07 {

	/**
	 */
	public static void main(String[] args) {
		System.out.println(""+100+200);
		System.out.println(100+200+"");
		System.out.println(100+""+200);
		System.out.println("请输入 a, b, c 用空格隔开:");
		Scanner in = new Scanner(System.in);
		int a,b,c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		int max = a>b? a:b;
		max = max>c? max:c;
		System.out.println("最大值是"+max);
	}

}
