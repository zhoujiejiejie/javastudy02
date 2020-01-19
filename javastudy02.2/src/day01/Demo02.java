package day01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* 1.追加写数据：使用两个参数的构造方法
* 2.换行：
*   windows：\r\n
*   linux:\n
*   mac:\r
* */
public class Demo02  {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("/home/zj/Pictures/c.txt",true);
                                                                            //true代表不覆盖，接着写 ，false代表覆盖

        for (int i = 1; i <10 ; i++) {
            fos.write("你好".getBytes());
            fos.write("\r".getBytes());
        }

        fos.close();
    }
}
