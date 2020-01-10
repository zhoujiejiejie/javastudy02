package day03;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        File f1=new File("/home/zj/Desktop/workspace/javastudy");  //判断路径是否存在
        System.out.println(f1.exists());

        System.out.println(f1.isAbsolute());  //判断是不是文件夹  **首先的保证构造方法中的路径存在
        System.out.println(f1.isFile());      //判断是不是文件
    }
}
