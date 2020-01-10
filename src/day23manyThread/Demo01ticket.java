package day23manyThread;
/*模拟买票
创建3个线程，同时开启，堆共享的票出售

* */
public class Demo01ticket {
    public static void main(String[] args) {
        RunnableImpl r=new RunnableImpl();

        Thread t0=new Thread(r);
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);

        t0.start();
        t1.start();
        t2.start();


    }
}
