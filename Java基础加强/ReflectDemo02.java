package Java基础加强;

import java.lang.reflect.Field;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        //获取Persion的class对象
        Class persionClass = Persion.class;

        //获取persion里的成员变量们

        Field[] fields = persionClass.getFields();
        for (Field i:fields)
        {
            System.out.println(i);
        }


        System.out.println("-------------------");

        Field a = persionClass.getField("a");
        //获取成员变量a的值
        Persion p=new Persion();
        Object value = a.get(p);
        System.out.println(value);
        a.set(p,"周杰");
        System.out.println(p);


        System.out.println("===================");


        Field[] declaredFields = persionClass.getDeclaredFields();
        //获取所有的成员变量,不考虑修饰符
        for (Field i:declaredFields){
            System.out.println(i);
        }

        Field d = persionClass.getDeclaredField("d");
        Persion z=new Persion();
        //d是private修饰，赋值或者获取前需要，忽略访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        d.set(z,"狗屎");
        System.out.println(z);

    }
}
