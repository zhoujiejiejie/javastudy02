package junit;

public class CalculatorTest {
    public static void main(String[] args) {
        //创建对象调用方法
        Calculator c=new Calculator();

        int add = c.add(1, 2);
        System.out.println(add);
    }
}
