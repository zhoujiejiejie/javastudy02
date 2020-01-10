package day01;

public class Demo04 {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦！！");
            }
        });

        invokeCook(()->{
            System.out.println("吃饭啦之二！！！！！");
        });

    }

    private static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
