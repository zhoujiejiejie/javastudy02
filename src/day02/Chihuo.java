package day02;

public class Chihuo extends Thread{
    private BaoZi bz;

    public Chihuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
while (true){
    synchronized (bz){
        if (bz.flag==false){
            try {
                bz.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //线程被唤醒之后
        System.out.println("吃货正在吃"+bz.Pi+bz.xian+"的包子");
        //吃完后改flag
        bz.flag=false;

        //然后唤醒包子铺线程
        bz.notify();
        System.out.println("吃货已经把"+bz.Pi+bz.xian+"的包子吃完啦，包子铺开始生产包子！！");
        System.out.println("-------------------------------------------------->");
    }
}
    }
}
