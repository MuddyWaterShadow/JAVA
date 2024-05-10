public class Person {
    private String name;    //现在类的属性只能被自己直接访问
    private int age;
    private String sex;

    /*public Person(String name,int age,String sex){  //构造方法也要声明为公共，否则对象都构造不了
        this.name = name;
        this.age = age;
        this.sex = sex;
    }*/

    public String getName(){    //想要知道这个对象的名字，必须通过getName()方法来获取，并且得到的只是名字值，外部无法修改
        return name;
    }
    public int age(){
        return age;
    }
    public String sex(){
        return sex;
    }

    public void setName(String name) {
        if(name.contains("小")) return;
        this.name = name;
    }

    //还可以将构造方法改成私有的，需要通过我们的内部的方式来构造对象
    private Person(String name,int age,String sex){     //不允许外部使用new关键字创建对象
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public static Person getInstance(String name,int age,String sex){
        return new Person(name,age,sex);    //而是需要使用我们的独特方法来生成对象并返回
    }

/*
单例模式
public class Test {
    private static Test instance;

    private Test(){}

    public static Test getInstance() {
        if(instance == null)
            instance = new Test();
        return instance;
    }
}
 */
}
