package com.aihqx.javabasic.day02;

/**
 *
 */
public class IntegerTest {
  public static void main(String[] args) {
    //  1010
    int n = 1010;
    System.out.println(n); 
    /*IntegerTest.toString(n, 10) 是将 n 按照10进制规则转换为
    10进制的字符串，如： 1010 ->  "10"*/
    System.out.println(java.lang.Integer.toString(n, 10));
    
  }
}
