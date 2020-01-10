package day23manyThread;
/*
* 实现买票案例
* */
public class RunnableImpl implements Runnable {
    //创建一个锁对象
    Object object=new Object();

    private int ticket = 100;           //票

    @Override
    public void run() {
      synchronized (object){
          while (true){
              if (ticket>=1){
                  try {
                      Thread.sleep(10);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }


                  System.out.println(Thread.currentThread().getName()+"--->"+"正在卖第"+ticket+"票");//买票
                  ticket--;
              }
          }
      }
    }
}
