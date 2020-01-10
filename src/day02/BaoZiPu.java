package day02;

public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {

        int count=0;

        while (true){
            synchronized (bz){
                if (bz.flag==true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (count%2==0){
                    bz.Pi="薄皮";
                    bz.xian="三鲜";
                }else {
                    bz.Pi="冰皮";
                    bz.xian="牛肉大葱";
                }
                count++;
                System.out.println("包子铺正在生产"+bz.Pi+bz.xian+"的包子！！");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag=true;
                //唤醒出货线程
                bz.notify();
                System.out.println("包子铺已经生产好了"+bz.Pi+bz.xian+"的包子！！"+"吃货可以吃了！");
            }
        }
    }
}
