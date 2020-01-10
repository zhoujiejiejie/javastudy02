package day02;

public class Test {
    public static void main(String[] args) {
        BaoZi bz=new BaoZi();

        new BaoZiPu(bz).start();

        new Chihuo(bz).start();
    }
}
