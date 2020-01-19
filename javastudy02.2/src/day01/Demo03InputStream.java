package day01;
/*
* java.io.InputStream:字节输入流
*
*
* java.io.FileInputStram extents InputStream
* 文件字节输入流：可以吧硬盘的数据读取到内存中用
*
* 构造方法：
* FileInputStram（文件路径）
* FileInputStram（文件名）
*
* */

import java.io.FileInputStream;
import java.io.IOException;

public class Demo03InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("/home/zj/Pictures/c.txt");

//        int read = fis.read();    //read一次只能读一个字节
//        System.out.println(read);

        int len=0;
        while (len!=-1){
            int read = fis.read();    //read一次只能读一个字节
          System.out.println(read);

          len=read;
        }

        fis.close();


    }
}
