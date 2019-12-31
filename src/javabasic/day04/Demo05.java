package day04;

import java.util.Scanner;

public class Demo05 {

	/**
	 */
	public static void main(String[] args) {
		int age = 25;
		char sex = '男';
		if(sex == '女' && age >= 60 ){
			System.out.println("");
		}else{
			System.out.println("");
		}
		System.out.println(age);//25发生短路了,age++没有执行
		
		if(sex =='女' & age++>=60){
			System.out.println("");
		}else{
			System.out.println("");
		}
		System.out.println(age); //  age++执行了
//		char c = 'K';
//		if(c>='A'&&c<='Z'){
//			System.out.println("");
//		}
		//判断一个字符是大写或者小写字母
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入英文字母：");
		int x = scanner.nextInt();
		System.out.println((char)x);
		char c = (char)x;
		if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
			System.out.println("是英文字母："+c);
		}
		
		
	}

}
