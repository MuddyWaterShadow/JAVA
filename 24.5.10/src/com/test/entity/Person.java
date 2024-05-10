package com.test.entity;

public class Person {
    /*
    访问权限控制
    private - 私有，标记为私有的内容无法被除当前类以外的任何位置访问。
    什么都不写 - 默认，默认情况下，只能被类本身和同包中的其他类访问。
    protected - 受保护，标记为受保护的内容可以能被类本身和同包中的其他类访问，也可以被子类访问（子类我们会在下一章介绍）
    public - 公共，标记为公共的内容，允许在任何地方被访问。
    */
    public String name ; //= test ();   //这里我们用test方法的返回值作为变量的初始值，便于观察
    public int age;
    public String sex;

    /*com.test.entity.Person(){       //构造方法不需要指定返回值，并且方法名称与类名相同
        name = "小明";
        age = 20;
        sex = "男";
    //    System.out.println("lwbnb");
        //构造方法会在对象创建时执行，我们可以将各种需要初始化的操作都在这里进行处理
    }*/
    /*com.test.entity.Person(String name, int age, String sex){   //跟普通方法是一样的
        this.name = name;
        this.age = age;
        this.sex = sex;*/

    {
    //    System.out.println("我是代码块");   //代码块中的内容会在对象创建时仅执行一次
        //且无论代码块放在哪里，都优先于构造方法
    }
/*
静态变量与静态方法
使用static关键字来声明一个变量或一个方法为静态的，一旦被声明为静态，那么通过这个类创建的所有对象，操作的都是同一个目标
 */
    public static java.lang.String info;    //这里我们定义一个info静态变量
    /*
    static void test(){
        System.out.println("我的名字是"+name);  此处name会报错
    }
    在静态方法中，无法获取成员变量的值
    同样的，在静态方法中，无法使用this关键字
    在静态方法中可以使用静态方法与静态变量
     */
    static {   //静态代码块可以用于初始化静态变量
        info = "测试";
    }
/*
在Java中使用一个类之前，JVM并不会在一开始就去加载它，而是在需要时才会去加载（优化）一般遇到以下情况时才会会加载类：
    访问类的静态变量，或者为静态变量赋值
    new 创建类的实例（隐式加载）
    调用类的静态方法
    子类初始化时
    其他的情况会在讲到反射时介绍
 */
    //以下来测试一下成员变量初始化、静态变量初始化、代码块、静态代码块以及构造方法的初始化顺序
/*    String test(){
        System.out.println("成员变量初始化");
        return "test";
    }
    static String info(){
        System.out.println("静态变量初始化");
        return "info";
    }
    static String info = info();

    {
        System.out.println("代码块");
    }
    static{
        System.out.println("静态代码块");
    }
    com.test.entity.Person(){
        System.out.println("构造方法");
    }*/
    public static void test(){
        //如果某个类中存在静态方法或是静态变量，那么我们可以通过静态导入的方式将其中的静态方法或是静态变量直接导入使用
    }
}
