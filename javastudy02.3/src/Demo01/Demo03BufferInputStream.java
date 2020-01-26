package Demo01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 字节缓冲输入流
* */
public class Demo03BufferInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("路径");

        BufferedInputStream bis=new BufferedInputStream(fis);

        int len=0;   //记录每次读取到的字节

        while ((len = bis.read())!=-1){
            System.out.println(len);
        }

        bis.close();
    }
}
