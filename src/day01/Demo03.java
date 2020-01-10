package day01;

public class Demo03 {
    public static void main(String[] args) {
        //使用匿名内部类创建新线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();

       //使用Lambda表达式实现多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"新线程创建了");
        }).start();
    }
}
