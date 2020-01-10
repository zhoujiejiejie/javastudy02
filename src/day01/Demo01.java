package day01;
//等待唤醒案例
public class Demo01 {
    public static void main(String[] args) {
        //创建锁对象
        Object object=new Object();

        //创建一个顾客线程
        new Thread(){
            @Override
            public void run() {
           while (true){
               synchronized (object){
                   System.out.println("告知老板需要的包子种类和数量");

                   try {
                       object.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println("吃好了！！！");
               }
           }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
               while (true){
                   synchronized (object){
                       //花5秒中做包子
                       try {
                           Thread.sleep(5000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       System.out.println("老板5秒钟之后告知顾客，可以吃包子了！！");
                       object.notify();

                   }
               }
            }
        }.start();
    }
}
