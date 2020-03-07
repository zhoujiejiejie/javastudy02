package Demo05Lambda;

public class Demo2Lambda {
    //定义一个显示日志的方法方法的参数传递日志的等级和函数式接口
    public static void souwLog(int level,Messagebuilder mb){
        if (level==1){
            System.out.println(mb.buildMessage());
        }

    }

    public static void main(String[] args) {
        //定义3个日志信息
        String msg1="Hello";
        String msg2="Word";
        String msg3="Java";

        souwLog(1,()->{
            return msg1+msg2+msg3;
        });

        /*
        * 使用Lambda表达式作为参数传递，仅仅是把参数传递到ShowLog中
        * 只有满足条件，level=1是
        *    才会调用MessageBuilder中的方法buildMessage
        *    才会进行字符串的拼接
        * 如果条件不满足，lever！=1，那么MessageBuild中的buildmessage也不会执行
        * 所以拼接字符串的代码也不会存在性能的浪费
        * */
    }
}
