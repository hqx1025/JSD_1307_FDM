package day06;

public class Demo01 {

	/**将整数倒置
	 */
	public static void main(String[] args) {
		int num = 654321;
		int sum = 0;
		do{
			int last = num %10;
			sum = sum*10 +last;
			num /= 10;
		}while(num !=0);
		System.out.println(sum);
	}

}
