package day0x1;
/**
 * 二进制计算 
 *  
 *  移位运算  >>  >>>  << 
 * 
 * 1）什么是移位运算 
 *    << 左移位  >> 数学右移   >>> 逻辑右移
 * 2） 移位运算的数学意义：就是2进制的移动小数点运算！
 *  导入：10进制的移动小数点运算
 *    1200.  小数点向右移动一次 相当于*10（基数）12000.
 *    如果小数点看做不动的话，就是数字左移动
 *    总之：数字左移动一次，就是原数字乘以一次基数！
 *    
 *    2进制一样: 数字左移动一次，就是原数字乘以一次基数！
 *    
 *    int i = 5;   //i= 00000101  5
 *    int n = i<<1;//n= 00001010  10
 *    // n = i*2
 *    
 *    数字右移动一次，就是原数字除以一次基数！
 *    
 *    i = 10;   //i = 00001010  10 
 *    n = i>>1; //n = 00000101  5
 *  
 *    i = -4;  //11111111 11111111 11111111 11111100  -4
 *    n = i>>2 //1 11111111 11111111 11111111 1111110 -2
 *    //>> 保持了符号位，结果是符合数学除法的结果
 *    
 * 3） 移位运算的用途
 */
public class Demo04{
	public static void main(String[] args) {
		int i = -2;
		System.out.println("原始数据");
		System.out.println(Integer.toBinaryString(i));
		int n = i<<1;
		System.out.println("i<<1 左移位1次");
		System.out.println(Integer.toBinaryString(n));
		i = -4;
		System.out.println("原始数据");
		System.out.println(Integer.toBinaryString(i));
		n = i >> 1;
		System.out.println("i>>1 数学右移位1次");
		System.out.println(Integer.toBinaryString(n));
		i = 10;
		System.out.println("原始数据");
		System.out.println(Integer.toBinaryString(i));
		n = i >> 1;
		System.out.println("i>>1 数学右移位1次");
		System.out.println(Integer.toBinaryString(n));
		
		i = -4;
		System.out.println("原始数据");
		System.out.println(Integer.toBinaryString(i));
		n = i >>> 1;
		System.out.println("i>>>1 逻辑右移位1次");
		System.out.println(Integer.toBinaryString(n));
		i = 10;
		System.out.println("原始数据");
		System.out.println(Integer.toBinaryString(i));
		n = i >>> 1;
		System.out.println("i>>>1 逻辑右移位1次");
		System.out.println(Integer.toBinaryString(n));
	}
}
