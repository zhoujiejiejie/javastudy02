package Demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
* TCP客户端：向服务器发送连接请求，读写服务器回写的数据
* 表示客户端的类：java.net.Socket
* */
public class TCPclient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);

        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("你好服务器".getBytes());

        InputStream inputStream = socket.getInputStream();

        byte[] bytes=new byte[1024];

        int len=inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));

        socket.close();

    }
}
