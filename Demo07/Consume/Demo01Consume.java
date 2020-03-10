package Demo07.Consume;

import java.util.function.Consumer;

public class Demo01Consume {
    /*
    * 定义一个方法
    * 方法的参数传递一个字符串姓名
    * 方法的参数传递一个Consumer接口，泛型使用String
    * 可以使用Consumer来消费字符串姓名
    * */

    public  static void method(String name, Consumer<String> con){
        con.accept(name);

    }

    public static void main(String[] args) {
        method("zhoujie",(name)->{
            System.out.println(name);

        });
    }
}
