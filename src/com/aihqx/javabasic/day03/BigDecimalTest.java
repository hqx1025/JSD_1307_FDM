package com.aihqx.javabasic.day03;

import java.math.BigDecimal;

public class BigDecimalTest {

	/**
	 * 
	 */
	public static void main(String[] args) {
		BigDecimal x = new BigDecimal("2.6");
		BigDecimal y = new BigDecimal("2");
		//subtract 减法
		BigDecimal z = x.subtract(y);
		System.out.println(z);
		//加法
		z = x.add(y);
		System.out.println(z);
		//乘法
		z = x.multiply(y);
		System.out.println(z);
		//除法
	    z = x.divide(y);
		System.out.println(z);


	}

}
