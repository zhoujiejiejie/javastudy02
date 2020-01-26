package Demo01;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 字节输出缓冲流
* */
public class Demo02BufferOutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos=new FileOutputStream("路径");

        BufferedOutputStream bos=new BufferedOutputStream(fos);

        bos.write("我吧数据写入到内部缓冲区中".getBytes());

        bos.flush();   //刷新

        bos.close();

    }
}
