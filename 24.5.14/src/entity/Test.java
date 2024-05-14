package entity;

public class Test {
//成员内部类
    public class Inner{    //内部类也是类，所以说里面也可以有成员变量、方法等，甚至还可以继续套娃一个成员内部类
        public void inner(){
            System.out.println("成员内部类");
        }
    }

    private final String name;

    public Test(String name){
        this.name = name;
    }
    public class Info{
        String name;

        public Info(String name){
            this.name = name;
        }
        public void info(String name){
            System.out.println("内部类方法参数的name = "+name);    //依然是就近原则，最近的是参数，那就是参数了
            System.out.println("成员内部类的name = "+this.name);   //在内部类中使用this关键字，只能表示内部类对象
            System.out.println("最大方法的name = "+Test.this.name);
            //如果需要指定为外部的对象，那么需要在前面添加外部类型名称

        }
    }
    /*
    String name;
    public void test(String name){
        this.toString();		//内部类自己的toString方法
        super.toString();    //内部类父类的toString方法
        Test.this.toString();   //外部类的toSrting方法
        Test.super.toString();  //外部类父类的toString方法
    }
     */
//静态内部类
    public static class Water{



        public void water(){
            System.out.println("静态内部类");
        }
    }

    public void hello(){
        class Inner{   //局部内部类跟局部变量一样，先声明后使用
            public void test(){
                System.out.println("我是局部内部类");
            }
        }

        Inner inner = new Inner();   //局部内部类直接使用类名就行
        inner.test();
    }//局部内部类的形式，使用频率很低，基本上不会用到


}
