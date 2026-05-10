package Shape;

public interface Shape {
    double area();//默认public abstract
    //或者可以加一个default方法 后续接入了这个接口的类不受影响
    //在此基础上，可以写一个自己的private方法，防止外界知道方法逻辑，然后再用自己的default方法调用这个private方法
    //或者加一个static方法 可以用Shape。方法名（） 来调用   是整个接口级别的工具
    //接口可以定义常量
    //String TYPE = “DDD”  默认public static final
}