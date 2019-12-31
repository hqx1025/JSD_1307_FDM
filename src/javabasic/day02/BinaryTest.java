package javabasic.day02;

public class Demo2 {
	public static void main(String[] args){
		int n = 0xfffffffe;
		int min = 0x80000000;
		//二进制
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(min));
		System.out.println(n);
		System.out.println(min);
		int a = 8;
		int b = -8;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
/*		  十进制      二进制     四位补码
           -8         1000
           -7         1001
           -6         1010
           -5         1011
           -4         1100
           -3         1101
           -2         1110
           -1         1111
            0         0000
            1         0001
            2         0010
            3         0011
            4         0100
            5         0101
            6         0110
            7         0111
*/	}

}
