package com.test;       //在放入包中，需要在类的最上面添加package关键字来指明当前类所处的包

//import com.test.entity.Person;      使用import关键字导入其他包中的类

import com.test.entity.*;   //使用*表示导入这个包中全部的类

import static com.test.entity.Person.test;     //如果某个类中存在静态方法或是静态变量，那么我们可以通过静态导入的方式将其中的静态方法或是静态变量直接导入使用

public class Main{
    public static void main(java.lang.String[] args){   //主方法的String参数是java.lang包下的，我们需要明确指定一下，只需要在类名前面添加包名就行了
        Person p1 = new Person();    //这里的new com.test.entity.Person()其实就是在调用无参构造方法
        new com.test.entity.Person();
        System.out.println(p1.name);
        Person p2 = new Person();
        Person p3 = new Person();
        p2.info = "杰哥你干嘛";
        System.out.println(p3.info);   //可以看到，由于静态属性是属于类的，因此无论通过什么方式改变，都改变的是同一个目标
        System.out.println(Person.info);    //所以说一般情况下，我们并不会通过一个具体的对象去修改和使用静态属性，而是通过这个类去使用

        //以下来测试一下成员变量初始化、静态变量初始化、代码块、静态代码块以及构造方法的初始化顺序
        Person p = new Person();
        test();
    }
}
