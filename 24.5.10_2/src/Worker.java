//public class Worker extends Student{} 类的继承可以不断向下，但是同时只能继承一个类
//public final class Human{} 标记为final的类不允许被继承
public class Worker extends Human{
    public Worker(String name,int age,String sex){        //子类在构造时，不仅要初始化子类的属性，还需要初始化父类的属性
        super(name,age,sex);        //使用super代表父类，父类的构造方法就是super()
    }

    String name;    //子类是可以定义和父类同名的属性的
    public void work(){
        System.out.println("我是 "+name+"，我在工作！");   //这里的name，依然是作用域最近的哪一个，也就是在当前子类中定义的name属性，而不是父类的name属性
        System.out.println("我是 "+super.name+"，我在工作！");  //这里使用super.name来表示需要的是父类的name变量
        //没有super.super这种用法，也就是说如果存在多级继承的话，那么最多只能通过这种方法访问到父类的属性（包括继承下来的属性）
    }
}
