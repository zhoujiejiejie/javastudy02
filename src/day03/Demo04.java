package day03;

import java.io.File;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        show01();

        show02();

        show03();
    }

    private static void show03() {
        File f1 =new File("/home/zj/Pictures/zhoujie");
        boolean delete = f1.delete();
        System.out.println(delete);

        File f2 =new File("/home/zj/Pictures/111");
        boolean delete2 = f2.delete();
        System.out.println(delete2);

        File f3 =new File("/home/zj/Pictures/zhoujie.txt");
        boolean delete3 = f3.delete();
        System.out.println(delete3);
    }

    private static void show02() {
        File f1 =new File("/home/zj/Pictures/zhoujie");
        boolean mkdir = f1.mkdir();
        System.out.println(mkdir);

        File f2 =new File("/home/zj/Pictures/111/222/333");
        boolean mkdirs = f2.mkdirs();
        System.out.println(mkdirs);
    }

    private static void show01() throws IOException {
        File f1 =new File("/home/zj/Pictures/zhoujie.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);
    }
}
