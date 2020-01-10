package day04;

public class Demo01Recurison {
    public static void main(String[] args) {
//        a();
        
        b(1);
    }

    private static void b(int i) {
        System.out.println(i);
        if (i==20000){
            return; //方法结束
        }
        i++;
        b(i);
    }

    private static void a() {
        System.out.println("a方法！！");
        a();
    }
}
