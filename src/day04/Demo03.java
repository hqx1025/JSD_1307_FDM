package day04;

public class Demo03 {

	/**
	 * 自增自减运算 ++ --
	 */
	public static void main(String[] args) {
		int a = 1;
		a++;  //先使用a的值然后增加1
		System.out.println(a);
		++a;  //先增加1 然后使用a
		System.out.println(a);
        int b;
        a = 1;
        b = a++;  //两个运算，先执行++ 运算，然后执行赋值运算
        //++运算  1）先取a的值1  作为a++表达式的值1
        //++运算  2）然后将a的值增加1  a为2
        //= 运算  3）将a++ 表达式的值1 赋值给b 为1
        System.out.println(a+","+b);
        a = 1;
        a = a++;//a++=1  
        a = ++a;//++a=2  a=2
        // 1)  先将a的值增加1，a为2
        // 2)  再取a的值2作为 ++a表达式  的值
        // 3)  将 ++a 表达式的值2 赋值给a  为2
        
        System.out.println(a++);//a++=2   a=3
        System.out.println(++a);//++a=4   a=4
	}

}
