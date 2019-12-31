package day04;

import java.util.Scanner;

public class PayMoney {

	/**用户从控制台输入贷款本金，贷款月利率和还款年数，
	 * 系统根据上述信息计算每月还款金额，要求每月还款
	 * 金额保留两位小数并且输出到控制台。
	 */
	public static void main(String[] args) {
		double p;
		double r;
		double m;
		double payment;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入本金：");
		p = in.nextDouble();
		System.out.println("请输入利率：");
		r = in.nextDouble();
		System.out.println("请输入年数：");
		m = in.nextDouble();
		payment = (p * r * (1 + r)*m) / ((1 + r)*m - 1);
		System.out.println("每月还款金为："+payment);
	}

}
