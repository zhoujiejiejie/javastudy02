package day03;

import java.io.File;

public class Demo02 {
    public static void main(String[] args) {
        show01();

        show02();
    }

    private static void show02() {
        File f1=new File("/home/zj/Pictures/385241535.jpeg");
        System.out.println(f1.length());

    }

    private static void show01() {
        File f1=new File("/home/zj/Desktop/workspace/javastudy02/a.txt");
        File absoluteFile1 = f1.getAbsoluteFile();
        System.out.println(absoluteFile1);

        File f2=new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);
    }
}
