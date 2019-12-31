package day0x1;

public class Demo02 {

/**
* 递归: 在功能（方法）中直接、间接调用了功能（方法）本身
* 
* 老和尚讲故事(){ 1) 从前有座山 2) 山上有座庙 3) 庙里有个老和尚 4) 如果老和尚累死了，就不讲了！ （ 递归结束条件） 5)
* 老和尚讲故事() } y = 1+2+...+(n-1)+n = f(n) = f(n-1)+n 并且 f(1)=1
* 
* 递归的优点 优点： 业务问题解决的很优雅 只需要解决一个层次，其他层次 问题就递归解决了。 递归的缺点 1)
* 大量消耗栈内存空间，不能进行过深层次的递归 否则 可能出现 栈溢出错误 使用递归的要点 1）不能过深的递归 2）不能发散递归 3）必须有结束条件
*/
	public static void main(String[] args) {
		int n = 5;
		int y = f(n);
		System.out.println(y);
	}

	public static int f(int n) {
		if (n == 1) {
			return 1;
		}
		return n + f(n - 1);
	}
}
