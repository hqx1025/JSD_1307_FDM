package saturday;
import java.util.Scanner;

public class CommandBySwitch {
	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int command = 0;
            $1: while (true) {
                System.out.println("请选择功能: " +
                		"1.显示全部记录 2.查询登录记录 0.退出");
                command = scanner.nextInt();
                switch (command) {
                case 1:
                    System.out.println("显示全部记录");
                    break;
                case 2:
                    System.out.println("查询登录记录");
                    break;
                case 0:
                    System.out.println("欢迎使用");
                    break $1;
                default :System.out.println("错了");
                }
            }
            scanner.close();
        }
}