package Demo07.Supplier;

import java.util.function.Supplier;

/*
* 常用的函数式接口
* java.util.function.Supplier<T>  接口只包含一个无参的方法：T grt()。用来获取一个泛型参数指定类型的对象数据。
* Supplier<T>接口又被叫做生产性接口，指定接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据
* */
public class Demo01Supplier {
    //定义一个方法，方法的参数传递一个Supplier接口，泛型指定String类型，get就会返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //调用getString方法，方法的参数是一个函数式接口，所以可以传递Lambda表达式
//        getString(()->{
////        //生产一个字符串并返回
////            return "胡歌";
////        });

        System.out.println( getString(()->{
            //生产一个字符串并返回
            return "胡歌";
        }));
    }
}
