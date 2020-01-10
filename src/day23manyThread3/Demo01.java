package day23manyThread3;

//使用lock锁

public class Demo01 {
    public static void main(String[] args) {

        RunnableImpl r=new RunnableImpl();

        Thread t0=new Thread(r);
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
