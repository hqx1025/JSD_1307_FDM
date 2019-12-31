package day05;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args){
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入整数(例如：100)");
		n = in.nextInt();
		int sum = 0;
		for(int i =0;i<=n;i +=2){
			sum += i;

			
	}
		System.out.println("1到"+n+"之间所有的偶数的累加和为："+sum);
		System.out.println(n+"的约数有：");
		for(int i =1;i<=100;i++){
			if(n%i==0)
				System.out.println(i);
		}

		}
	}
	

