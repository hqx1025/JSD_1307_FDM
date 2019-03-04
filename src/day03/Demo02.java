package day03;

public class Demo02 {
	public static void main(String[] args){
		long max = 0x7fffffffffffffffL;
		//long max = 0x7fffffffffffffff; 编译错误
		System.out.println(max);
		//获取系统当前时间毫秒数
		long now = System.currentTimeMillis();
		System.out.println(now);
		long year = now/1000/60/60/24/365;
		System.out.println(year+1970);
		year = max/1000/60/60/24/365 + 1970;
		System.out.println(year);

	} 

}
