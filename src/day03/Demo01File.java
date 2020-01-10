package day03;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {

        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);   //路径分隔符 windows是; linux是:

        String separator = File.separator;
        System.out.println(separator);        //文件名称分隔符  windws是反斜杠\  linux是正斜杠/
        //所以路径里的斜杠可以用File.separator来代替

        show01();
    }

    private static void show01() {
    }
}
