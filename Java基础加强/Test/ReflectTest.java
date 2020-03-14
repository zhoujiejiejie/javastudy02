package Java基础加强.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
//可以创建任意类的对象，可以去执行任意方法

//        Persion p=new Persion();
//        p.eat();

        /*
        * 前提：不能改变该类的任何方法，可以创建任意类的对象，可以去执行任意方法
        *
        * */

        /*
        * 原理：
        * 1.利用配置文件
        * 2.利用反射
        * */

        //1加载配置文件
        //1.1创建properties对象
        Properties pro=new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件
        final ClassLoader classLoader = ReflectTest.class.getClassLoader();
        final InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //2.获取配置文件中的数据
        final String className = pro.getProperty("className");
        final String methodName = pro.getProperty("methodName");

        //3.加载该类进内存
        final Class cls = Class.forName(className);
        //4.创建对象
        final Object obj = cls.newInstance();
        //5.获取方法对象
        final Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);
    }
}
