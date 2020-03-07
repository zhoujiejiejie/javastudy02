package Demo05Lambda;
/*
 * 使用Lambda优化日志案例
 * Lambda特点：延迟加载
 * Lambda使用前提：必须存在函数式接口
 * */
@FunctionalInterface
public interface Messagebuilder {
    //定义一个抽象方法，放回一个被拼接的消息
    public abstract String buildMessage();


}
