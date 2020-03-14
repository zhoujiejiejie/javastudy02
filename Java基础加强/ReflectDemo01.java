package Java基础加强;

public class ReflectDemo01 {
    /*
    * 获取class的3种方式
    * */

    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class.forName("全类名")来获取
        Class cls1 = Class.forName("Java基础加强.Persion");
        System.out.println(cls1);


        //2.类名.class
        Class cls2 = Persion.class;
        System.out.println(cls2);

        //3.对象.getClass()
        Persion p=new Persion();
        Class cls3 = p.getClass();
        System.out.println(cls3);


        System.out.println(cls1==cls2);
        System.out.println(cls2==cls3);
    }
}
