package com.aihqx.javabasic.day07;

import java.util.Arrays;
/**
 * 数组的扩容 与 追加
 * 1) 数组创建以后长度不可改变
 * 2) 利用更换数组的方式实现扩容算法 
 * 3) 更换数组时候，利用复制方法保持原数组内容。
 * 
 * 数组扩容是Java API 实现的常用算法！
 *  "a:"+a ->  "a:100" 
 */
public class Demo07 {
	public static void main(String[] args) {
		//扩容原理：更换新数组
		String[] playlist = {"忐忑", "Poker Face"};
		System.out.println(Arrays.toString(playlist));
		playlist=new String[]{"忐忑", "Poker Face","甜蜜蜜"};
		System.out.println(Arrays.toString(playlist));
		//扩容：为playlist扩容并追加 新 歌曲 “橄榄树” 
		playlist=Arrays.copyOf(playlist, playlist.length+1);
		playlist[playlist.length-1] = "橄榄树";
		System.out.println(Arrays.toString(playlist));  
		
		//1) 复制新数组（增加容量）
		//2) 替换原数组
		String[] newOne = new String[playlist.length+1];
		System.arraycopy(playlist, 0, 
				newOne, 0, playlist.length);
		playlist = newOne;
//		playlist = Arrays.copyOf(playlist, playlist.length+1);
		
		System.out.println(Arrays.toString(playlist));
		
		
	}
}








