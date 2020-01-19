package day01;

/*
* 字节输出流的使用步骤
*   1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
*   2.调用FileOutputStream对象中的write方法，把数据写入到文件中
*   3.释放资源（流使用会占用一定的内存，使用完把内存清空提高程序效率）
* */

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("");

        fos.write(97);

        fos.close();
    }
}
