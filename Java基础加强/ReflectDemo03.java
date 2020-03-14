package Java基础加强;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        //获取Persion的class对象
        Class persionClass = Persion.class;

        //获取persion里的构造方法
        Constructor constructor = persionClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object persion = constructor.newInstance("张三", 23);
        System.out.println(persion);

        Constructor constructor1 = persionClass.getConstructor();
        System.out.println(constructor);
        Object persion1 = constructor.newInstance("张四", 23);
        System.out.println(persion1);


    }
}
