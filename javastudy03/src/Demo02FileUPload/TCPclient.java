package Demo02FileUPload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
* 上传文件客户端：读取要上传的文件，上传到服务器，读取服务器回写的数据
*
* 步骤
* 1.创建一个本地字节输入流FileInputStream对象，构造方法中绑定要读取的数据源
* 2.创建一个客户端Sock对象，构造方法中绑定服务器的ip地址和端口号
* 3.使用Sock中的getOutputstearm方法，获取网络字节输出流对象
* 4.使用fileinputstream的read方法读本地文件
* 5.用网络字节输出流OutputStream对象中的write方法把读到的数据上传到服务器
* */
public class TCPclient {
    public static void main(String[] args) throws IOException {
        //1.创建一个本地字节输入流
        FileInputStream fis=new FileInputStream("/home/zj/Pictures/385241535.jpeg");


        Socket socket=new Socket("127.0.0.1",8888);


        OutputStream os = socket.getOutputStream();

        //读取本地数据
        int len=0;
        byte[] bytes=new byte[1024];
        while ((len=fis.read(bytes))!=-1){

            os.write(bytes,0,len);
        }

        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        while ((len=is.read(bytes))!=-1){

            System.out.println(new String(bytes,0,len));
        }



        fis.close();
        socket.close();

    }
}
