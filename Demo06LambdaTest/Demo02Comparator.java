package Demo06LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {
    //定义一个方法，方法的返回值类型使用函数式接口Comparator(比较)
    public static Comparator<String> getComparator(){
    //方法的返回值类型是一个接口，那么我们可以返回这个接口的匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //按照字符串的降序排序
//                return o2.length()-o1.length();
//
//            }
//        };

        //方法的返回值类型是一个函数式接口，所以我们可以返回一个Lambda表达式
        return (String o1, String o2)->{
            //按照字符串的降序排序
            return o2.length()-o1.length();
        };
    }

    public static void main(String[] args) {
        String [] arr={"aaa","b","cccccccc","ddddddd"};
        //输出排序前的数组
        System.out.println(Arrays.toString(arr));

        //调用Arrys中的sort方法，堆字符串数组进出排序
        Arrays.sort(arr,getComparator());
        //输出排序后的数组
        System.out.println(Arrays.toString(arr));


    }
}
