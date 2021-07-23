package com.aihqx.javabasic.saturday;
import java.util.Scanner;

public class CommandByIf {
	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String command = null;
            while (true) {
                System.out.println("请选择功能: " +
                		"1.显示全部记录 2.查询登录记录 0.退出");
                command = scanner.next();
                if ("1".equals(command)) {
                    System.out.println("显示全部记录");
                } else if ("2".equals(command)) {
                    System.out.println("查询登录记录");
                } else if ("0".equals(command)) {
                    System.out.println("欢迎使用");
                    break; 
                }
            }
            scanner.close();
        }
}