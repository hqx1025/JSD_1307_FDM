package day03;

import java.math.BigDecimal;

public class Demo04 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		BigDecimal x = new BigDecimal("2.6");
		BigDecimal y = new BigDecimal("2");
		//subtract 减法
		BigDecimal z = x.subtract(y);
		System.out.println(z);
		z = x.add(y);       //加法
		System.out.println(z);  
		z = x.multiply(y);   //乘法
		System.out.println(z);
	    z = x.divide(y);   //除法
		System.out.println(z);


	}

}
