package junit.test;

import junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    /*
    * 测试add方法
    * */
    @Test
    public void testAdd(){
        //int a=3/0;

        //System.out.println("我被执行了");

        Calculator c=new Calculator();
        int add = c.add(5, 9);
        System.out.println(add);

        Assert.assertEquals(15,add);
    }
}
