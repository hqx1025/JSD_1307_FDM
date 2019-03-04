package day05;

import java.util.Scanner;

public class Demo01 {

	/**
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入分数:");
		int score = s.nextInt();
		if(score>=90) System.out.println("A");
		else if(score>=80) System.out.println("B");
		else if(score>=70) System.out.println("C");
		else if(score>=60) System.out.println("D");
		else  System.out.println(3.0/100);
	}

}
