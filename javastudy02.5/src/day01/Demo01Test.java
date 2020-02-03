package day01;

import java.io.*;
import java.util.HashMap;

public class Demo01Test {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map=new HashMap<>();

        //创建一个字符缓冲输入流，构造方法中绑定字符输入流
        BufferedReader br=new BufferedReader(new FileReader("/home/zj/Pictures/c.txt"));

        //创建一个字符缓冲输出流，构造方法中绑定字符输出流
        BufferedWriter bw=new BufferedWriter(new FileWriter("/home/zj/Pictures/a.txt"));

        String line;

        while ((line=br.readLine())!=null){
            String[]  arr = line.split("\\.");

            map.put(arr[0],arr[1]);
        }

        for (String key:map.keySet()){

            String value=map.get(key);

            line=key+"."+value;

            bw.write(line);
        }

        bw.close();

        br.close();


    }
}
