package day03;

public class Demo07 {
	public static void main(String[] args){
		int age =18;
		boolean isChild = age < 16;
		//这个结果表示: 不是小孩
		System.out.println(isChild);
		
		boolean isMan = true;// 所爷们吗？ 纯爷们
		boolean used = true; // 用过， 二手
		boolean pause = false; // 暂停
		
		boolean f = true; //这个没有意义!
		
		if(pause){
			System.out.println("输出了就是真");
		}else{
			System.out.println("这个输出了就是假");
		}
		if(used){
			System.out.println("True");
		}
		
		
	}

}
