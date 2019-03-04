package day02;

public class Demo {
	public static void main(String[] args){
		//System.out.println(age);//编译错误，找不到age变量
		int age;
		//System.out.println(age);//编译错误，age变量可能没有初始化
		age = 2;
		age = 5;
		System.out.println(age);

	{
		int score = 20;
		System.out.println(score);
		System.out.println(age);
	}

}
}
