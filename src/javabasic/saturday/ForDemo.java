package saturday;

public class ForDemo {

	/**
	 */
	// public static void main(String[] args) {
	// int sum = 0;
	// for(int i =1; i<=10000;i++){
	//			
	// sum += i ;
	// System.out.println(sum);
	//			
	//			
	// }
	// }

	public static void main(String args[]) {
		int a = 60;
		int b;
		int c;
		if (a > 50) {

			b = 9;
		}
		// c = b + a; 变量b未赋值 编译器 不能判断a 是否大于50
		System.out.println();
		long f = 1;
		for (int i = 2; i <= 20; i++) {
			f *= i;
			System.out.println(f);
		}
		System.out.println(f);

		// 数列求和
		long nine = 9;
		long result = nine;
		for (int i = 2; i <= 10; i++) {
			nine = nine * 10 + 9;
			result += nine;
		}
		System.out.println("9+99+999+...+9999999999=" + result);

	}
}
