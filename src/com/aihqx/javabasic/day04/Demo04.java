package com.aihqx.javabasic.day04;

public class Demo04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i =0;
		System.out.println(i++ % 3);
		System.out.println(i++ % 3);
		System.out.println(i++ % 3);
		System.out.println(i++ % 3);
		System.out.println(i++ % 3);
		System.out.println(i++ % 3);
		System.out.println(i++ % 3);
		System.out.println(i++ % 3);
		
		String[] players = {"刘","苍","松","老","北京"};
		String one = players[0];
		System.out.println(one);
		 i = 0;
        System.out.println(players[i++ % 5]);
        System.out.println(players[i++ % 5]);
        System.out.println(players[i++ % 5]);
        System.out.println(players[i++ % 5]);
        System.out.println(players[i++ % 5]);
        System.out.println(players[i++ % 5]);
        System.out.println(players[i++ % 5]);
        System.out.println(players[i++ % 5]);
        System.out.println(players[i++ % 5]);
        System.out.println(players[i++ % 5]);
	}

}
