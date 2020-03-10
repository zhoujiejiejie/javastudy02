package Demo07.Supplier;

import java.util.function.Supplier;

public class Demo02Test {
    public static int getMax(Supplier<Integer> sup){
      return sup.get();
    }


    public static void main(String[] args) {
        //第一个int类型数组
        int[] arry={5,100,0,-50,33,-90};

        //getMax的参数是函数式接口，所以可以传递一个Lambda表达式
        int maxVale= getMax(()->{
            int max=arry[0];
            //遍历数组获取数组中的其他元素
            for (int i : arry) {
                //使用其他元素和最大值比较
                if (i>max){
                    max=i;
                }
            }
            return max;
        });
        System.out.println(maxVale);
    }
}
