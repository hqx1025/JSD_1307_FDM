package day05;
/**
 * 反转一个整数 num = 37195  结果：59173 
 */
public class Demo14 {
	public static void main(String[] args) {
		int num = 37195;
		int sum = 0;
		while(true){
			int last = num % 10; 
			sum = sum*10+last; 
			num /= 10; 
			System.out.println(last+","+num+","+sum); 
			if(num==0){
				break;
			}
		}
		System.out.println(sum); 
		
//		int last = num % 10;//5
//		sum = sum*10+last;//sum=5
//		num /= 10;//3719
//		
//		last = num % 10;//9
//		sum = sum*10+last;//sum=59
//		num /= 10;//371
//		
//		last = num % 10;//1
//		sum = sum*10+last;//sum=591
//		num /= 10;//37
//		
//		last = num % 10;//7
//		sum = sum*10+last;//sum=5917
//		num /= 10;//3
//		
//		last = num % 10;//3
//		sum = sum*10+last;//sum=59173
//		num /= 10;//0 这是循环结束的条件 num==0
//		
		
	}
}
