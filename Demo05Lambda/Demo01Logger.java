package Demo05Lambda;
/*
* 日志案例
* */
public class Demo01Logger {
    //根据日志的级别，显示日志信息的方法
    public static void showLog(int level,String message){
        //堆日志的等级判断，如果是1，输出日志
        if (level==1){
            System.out.println(message);
        }

    }


    public static void main(String[] args) {
        //定义3个日志信息
        String msg1="Hello";
        String msg2="Word";
        String msg3="Java";

        showLog(2,msg1+msg2+msg3);
    }
}
