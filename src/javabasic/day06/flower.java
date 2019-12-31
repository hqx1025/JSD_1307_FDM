package day06;

import java.util.Scanner;

public class flower {

	/**
	 * 水仙花数问题。
	 * 计算某个范围内所有水仙花数。用户输入0到某个范围的数，
	 * 系统输出这个范围内的所有水仙花数，水仙花数是指一个 n 位数 ( n≥3 )，
	 * 它的每个位上的数字的 n 次幂之和等于它本身。
	 */
	public static void main(String[] args) {
		int x;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入查找水仙花的范围:0~");
		x = in.nextInt();
		for(int i=100;i<=x;i++){
			int num = i;
			int sum = 0;
			do{
				int last  = num%10;
				sum += last*last*last;  //三次方的和
				num /=10;
				
			}while(num!=0);
			if(sum ==i)
				System.out.print(i+"  ");
	}
	}
}
