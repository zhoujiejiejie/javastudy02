package Demo01;

/*
* java.util.Properties集合 extends   Hashtable<K,V>

* * Propertise类表示了一个持久的属性集
 * Propertise集合是唯一一个与Io流相结合的集合
 * Load：可以把硬盘中保存的文件（K，V），读取到集合中使用
 * Store：吧集合中的临时数据，持久化写入到硬盘中储存
 *
 * * Propertise集合是一个双列集合
 *
* */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show01();


        show02();
    }

    private static void show02() throws IOException {
        Properties prop=new Properties();

        prop.setProperty("赵丽颖","168");
        prop.setProperty("周杰","180");
        prop.setProperty("狗屎","165");

        FileWriter fw=new FileWriter("写入地址");

        prop.store(fw,"注释");

        fw.close();

    }

    private static void show01() {
        Properties prop=new Properties();

        prop.setProperty("赵丽颖","168");
        prop.setProperty("周杰","180");
        prop.setProperty("狗屎","165");

        Set<String> strings = prop.stringPropertyNames();
        System.out.println(strings);

    }
}
