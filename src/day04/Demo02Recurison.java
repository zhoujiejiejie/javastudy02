package day04;

public class Demo02Recurison {
    public static void main(String[] args) {
        int sum = sum(3);
        System.out.println(sum);
    }

    private static int sum(int i) {
        if (i==1){
            return 1;
        }

        return i+sum(i-1);
    }

}
