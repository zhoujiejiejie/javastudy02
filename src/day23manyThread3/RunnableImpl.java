package day23manyThread3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {

    Lock l = new ReentrantLock();

    private int ticket = 100;           //票


    @Override
    public void run() {

        if (ticket >= 1) {
            l.lock();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "--->" + "正在卖第" + ticket + "票");//买票
            ticket--;
        }
        l.unlock();
    }

}
