package firstday.demo;

import java.util.Scanner;
//导入 Java API
//Scanner  扫描仪 ，可以从控制台读取数据
public class HelloWorld {
//缩进一个tab的宽度
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的名字：");
		//读取 scanner 的字符数据
		String name = scanner.next();
		System.out.println(name+"欢迎来到Java的世界！");
		System.out.println(" Hello \n World!");
	}

}//类体结束与开始对齐
