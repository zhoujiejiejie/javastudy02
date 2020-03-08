package Demo04;

/*
* 函数式接口的使用：一般可以做为方法的参数和返回值类型
* */
public class Demo {
    public static void show(MyFunctionalInterface myInter){

        myInter.method();
    }

    public static void main(String[] args) {
        //调用show方法，方法的参数是一个接口，所以可以传递该接口的实现类对象
        show(new MyFunctionalInterfaceImpl());


        //调用show方法，方法的参数是一个接口，所以我们可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法！");
            }
        });

        // //调用show方法，方法的参数是一个接口，所以我们可以传递Lambda表达式
        show(()->{
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });

    }
}