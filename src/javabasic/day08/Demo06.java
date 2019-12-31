package day0x1;

public class Demo06 {

	/**
	 */
	public static void main(String[] args) {
		int a = 0;
		int red = 192 ;
		int green = 12;
		int blue = 96;
		int color = (a<<24)+(red<<16)+(green<<8)+(blue<<0);
		System.out.println(Integer.toHexString(color));
		
		//将24位int 彩色 ，拆分为 颜色分量 r g b
		//
		color = 0x685fbf;
		int mask = 0xff;
		blue = color&mask;
		
		green = (color>>>8)&mask;
		red = (color>>>16)&mask;
		System.out.println(red);
		System.out.println(green);
		System.out.println(blue);
		
		int c = ~color;
		System.out.println(Integer.toBinaryString(c));
	}

}
