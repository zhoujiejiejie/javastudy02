package day04;

public class Demo03Recurison {
    public static void main(String[] args) {
        int a = a(3);
        System.out.println(a);
    }

    private static int a(int i) {
        if (i==1){
            return 1;
        }
        return i*a(i-1);
    }
}
