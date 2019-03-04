package day06;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {

	/**
	 * 猜数字  
	 * 数据分析的前提是业务规则
	 * 
	 * number  是被猜的数字
	 * answer  是用户猜的答案
	 * count   是猜测的次数
	 * 
	 *   计算方法（计算过程）：
	 *    1） 随机生成number  范围1～100
	 *    2） 提示用户猜测数据
	 *    3） 得到猜测答案   answer
	 *    4）比较用户answer 和number
	 *       4.1   记分 count++
	 *       4.2   如果相等就结束
	 *       4.3   提示大/小
	 *    5）返回   2)
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int number = r.nextInt(101);
		System.out.println("###  输入-1  退出游戏 !     ###");
		System.out.println("猜猜答案吧～有100次机会哦～(提示：范围是0～100哦)：");

		int count = 8;
		while(true){
			int answer = in.nextInt();
			if(answer==-1)
				break;
			if(answer<number){
				System.out.println("小了点哦,亲~再试试看");
			}
			if(answer>number){
				System.out.println("大了点哦,亲~再试试看");
			}
			count--;
			if(answer==number){
				System.out.println("你真棒～～～看看你用了多少次机会～～");
				
				break;
			}
			
			if(count==0){
				System.out.println("真遗憾～机会用完了!");
			break;}
		}
		System.out.println("游戏结束，用了 "+(8-count)+"次机会～！");
		
	}

}
