package Java基础加强;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        //获取Persion的class对象
        Class persionClass = Persion.class;
        //获取成员方法
        Method eat_Method = persionClass.getMethod("eat");
        Persion p=new Persion();
        eat_Method.invoke(p);


        Method eat1 = persionClass.getMethod("eat1", String.class, String.class);
        Persion z=new Persion("zhoujie",25);

        Object invoke = eat1.invoke(z,"筷子", "勺子");
        System.out.println(invoke);

        System.out.println("----------------");
        //获取所以public修饰的方法
        final Method[] methods = persionClass.getMethods();
        for (Method m:methods){
            System.out.println(m);
            System.out.println(m.getName());

        }

        //获取类名
        final String name = persionClass.getName();
        System.out.println(name);
    }
}
