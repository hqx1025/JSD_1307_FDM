package com.aihqx.javabasic.day05;

public class C {

	/**   9 * 9 乘法表
	 */
	public static void main(String[] args) {
		for(int i = 1;i<=9;i++){
			for(int j =1;j<=i;j++){
				int k = i*j;
				System.out.print(i+"x"+j+"="+k+" ");
			}
			System.out.println('\r');
		}
//		String a=null; if (a!=null & a.length()>10) {
//			System.out.println("Hi");
//			
//		}
	}

}
