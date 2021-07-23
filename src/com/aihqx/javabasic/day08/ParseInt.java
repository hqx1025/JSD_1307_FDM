package com.aihqx.javabasic.day08;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.Random;


    /*
    *描述此段代码的功能：（ int数据类型的解析 ）
    */
    public class ParseInt {
        public static void main(String[] args) throws Exception {
            before();
            RandomAccessFile raf = new RandomAccessFile("tmp", "r");
    //此句的意义何在？（ 读取一个有符号的八位值 ）
            byte b1 = raf.readByte();
            byte b2 = raf.readByte();
            byte b3 = raf.readByte();
            byte b4 = raf.readByte();
            raf.close();
            // -------------------------------------------
    //此句的意义何在？（系统使用0xff清理int数据: 将高24位清理为0, 低8位是从文件中读取的byte数据 ）
            int d1 = b1 & 0xff;        
            int d2 = b2 & 0xff;
            int d3 = b3 & 0xff;
            int d4 = b4 & 0xff;
            int value = (d1 << 24) + (d2 << 16) + (d3 << 8) + d4;
            System.out.println("解析出的int数据是：" + value);
            // -------------------------------------------
            after();
        }
    //此方法的功能是：（ 实现将一个int类型的随机数存入tmp文件 ）
        public static void before() throws Exception {
            DataOutputStream dos =
    new DataOutputStream(new FileOutputStream("tmp"));
            Random ran = new Random();
            int value = ran.nextInt(Integer.MAX_VALUE);
            System.out.println("存入文件的int数据是：" + value);
            dos.writeInt(value);
            dos.close();
        }
    //此方法的功能是：（ 将tmp文件删除 ）
        public static void after() throws Exception {
            File file = new File("tmp");
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }