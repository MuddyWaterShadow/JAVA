/*
接口
只代表某个确切的功能，也就是只包含方法的定义
 */
public interface Study {
    public abstract void study();       //public abstruct是默认的，可以省略

    default void test1() {   //使用default关键字为接口中的方法添加默认实现
        System.out.println("我是默认实现");
    }

    int a = 10;     //默认是public static final

    public static void test(){    //接口中定义的静态方法也只能是public的
        System.out.println("我是静态方法");
    }

    /*接口是可以继承自其他接口的：
    public interface A exetnds B {
    }*/

    /*并且接口没有继承数量限制，接口支持多继承：
    public interface A exetnds B, C, D {
    }*/


}
