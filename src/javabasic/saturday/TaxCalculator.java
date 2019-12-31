package saturday;

import java.util.Scanner;

public class TaxCalculator {

	/**
	 * 个人所得税计算器
	 */
	public static void main(String[] args) {
		
		double wages; // 工资
		double shouldtax;  //应稅工资
		double tax = 0;   //税金

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的工资的税前金额(元)：");
		wages = scanner.nextDouble();
		shouldtax = wages - 3500;


		if (shouldtax > 0 && shouldtax <= 1500)
			tax = shouldtax * 0.03 - 0;

		else if (shouldtax <= 4500)
			tax = shouldtax * 0.1 - 105;

		else if ( shouldtax <= 9000)
			tax = shouldtax * 0.2 - 555;

		else if ( shouldtax <= 35000)
			tax = shouldtax * 0.25 - 1005;

		else if (shouldtax <= 55000)
			tax = shouldtax * 0.3 - 2755;

		else if ( shouldtax <= 80000)
			tax = shouldtax * 0.35 - 5505;

		else if (shouldtax > 80000)
			tax = shouldtax * 0.45 - 13505;

		else
			tax = 0;

		System.out.println("你应该缴纳的个人所得税是：" + tax);
	}

}
