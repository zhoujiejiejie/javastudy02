package day01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
* 字节输入流，一次读取多个字节
* */
public class Demo04 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis=new FileInputStream("/home/zj/Pictures/c.txt");

        byte[] bytes = new byte[20];
        int len = fis.read(bytes);

        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));

        fis.close();
    }
}
