package com.aihqx.javabasic.day06;

import java.util.Scanner;

public class ScoreManagement {

	/**
	 * 成绩管理程序
	 */
	public static void main(String[] args) {
		String[] names = { "Eric", "Eric1", "Eric2", "Eric3", "Eric4", "Eric5",
				"Eric6", "Eric7", "Eric8", "Eric9" };
		int[] scores;
		Scanner in = new Scanner(System.in);
		scores = new int[10];
		outer: while (true) {
			System.out.println("＊＊＊＊＊＊欢迎进入成绩管理系统＊＊＊＊＊＊");
			System.out
					.print("请选择功能：1 － 成绩录入 ，  2 － 成绩列表 ， 3 －成绩查询， 4－成绩统计， 5－ 退出 ");
			int chose = in.nextInt();
			int sum = 0;
			switch (chose) {
			case 1:
				System.out.println("开始录入成绩：");
				for (int i = 0; i < names.length; i++) {
					System.out.print(i + 1 + ". 学生姓名：" + names[i] + "，成绩：?  ");
					scores[i] = in.nextInt();

				}
				System.out.println("录取完毕。");
				break;
			case 2:
				System.out.println("编号            姓名            成绩");
				System.out.println("------------------------");
				for (int i = 0; i < names.length; i++) {
					System.out.println((i + 1) + "       " + names[i] + "  "
							+ "   " + scores[i]);
					sum += scores[i];

				}
				System.out.println("-------------------------");
				System.out.println("平均成绩：" + sum / scores.length);

				break;
			case 3:
				System.out.print("请输入您要查询的学生姓名：");
				String name = in.next().trim();
				int i = 0;
				for (; i < names.length; i++) {
					if (name.equalsIgnoreCase(names[i])) {
						break;
					}
				}
				if (i < names.length) {
					System.out.println((i + 1) + ". 学生姓名：" + names[i] + ", 成绩："
							+ scores[i]);
				} else {
					System.out.println("对不起，找不到学员的信息。");
				}
				// for(int i = 0;i<names.length;i++){
				// if(name==names[i])
				// System.out.print((names.length+ 1) + ". 学生姓名：" + names[i] +
				// "，成绩：  "+scores[i]);
				// break;
				// }
				break;
			case 4:
				// 统计不及格（0－59）、及格（60－79）、良好（80－89）、优秀（90－99）和满分（100）的人数
				int failed = 0;
				int pass = 0;
				int fine = 0;
				int excellent = 0;
				int full = 0;

				for (i = 0; i < scores.length; i++) {
					if (scores[i] < 60)
						failed++;
					else if (scores[i] >= 60 && scores[i] <= 79)
						pass++;
					else if (scores[i] >= 80 && scores[i] <= 89)
						fine++;
					else if (scores[i] >= 90 && scores[i] <= 99)
						excellent++;
					else if (scores[i] == 100)
						full++;
				}
				// 输出
				System.out.println("满分(100)：" + full + "人");
				System.out.println("优秀(99-90)：" + excellent + "人");
				System.out.println("良好(89-80)：" + fine + "人");
				System.out.println("及格(79-60)：" + pass + "人");
				System.out.println("不及格(59-0)：" + failed + "人");
				break;
			case 5:
				System.out.println("**********谢谢使用**********");
				break outer;

			}

		}

	}
}
