package Demo3BSTCP;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 创建一个BS版本的TCP服务器
* */
public class TCPServer {
    public static void main(String[] args) throws IOException {

        //创建一个服务器ServerSocket，和系统要指定的端口号。
        ServerSocket server = new ServerSocket(8080);

        //用accept方法获取到请求的客户端对象（浏览器请求）
        Socket socket = server.accept();
        //使用socket中的方法getinputstream,获取到网络字节输入流InPutstream对象
        InputStream is = socket.getInputStream();

        //使用网络字节输入流中的对象read读取客户端的请求信息
//        byte[] bytes=new byte[1024];
//        int len=0;
//        while ((len=is.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }

        //往浏览器客户端回写一张图片
        //先创建一个本地的字节数人流，构造方法中要读的文件路径。
        FileInputStream fis=new FileInputStream("/home/zj/Pictures/385241535.jpeg");

        //再使用socket中的getoutputstream获取网络字节输出流outputstream对象
        OutputStream os = socket.getOutputStream();
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        os.write("\r\n".getBytes());

        byte[] bytes=new byte[1024];
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }

        fis.close();
        server.close();
        socket.close();
    }
}
