package com.aihqx.javabasic.day03;

import java.util.Scanner;

public class FreeFall {
	public static void main(String[] args){
		double s;
		double t;
		double g = 9.8;

	  /*Scanner scanner = new Scanner(System.in);
		System.out.println("请输入下落时间 t (s)= ");
		t = scanner.nextDouble(); 
		s = ( g * t * t)/2;

		scanner.close();
		System.out.println("自由落体的距离为： s = "+s);
	  */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入下落距离 s (m)= ");
		s = scanner.nextDouble(); 
		t = Math.sqrt((2*s)/g);

		scanner.close();
		System.out.println("自由落体的时间为： t = "+t);
		
		

	}

}
