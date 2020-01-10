package day23manyThread2;
/*
* 实现买票案例
* */
public class RunnableImpl implements Runnable {

    private int ticket = 100;           //票

    @Override
    public void run() {
          while (true){
              payTicket();

          }
      }

      public synchronized void payTicket(){
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
