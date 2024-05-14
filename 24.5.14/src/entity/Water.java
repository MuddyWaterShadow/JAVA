package entity;

public class Water {

    static{
        System.out.println("外部类初始化");
    }

    public static class Test{

        static{
            System.out.println("内部类初始化");
        }

        public static void test(){
            System.out.println("内部方法初始化");
        }
    }
    //并不会打印"外部类初始化"，是由于在编译过程中，内部类会独立于外部类，成为一个新的.class文件，因此只调用静态内部类的时候，不会初始化外部类
}
