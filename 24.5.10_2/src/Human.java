public class Human {
    protected String name;
    protected int age;
    protected String sex;

    public String setName(String name){
        this.name = name;
        return name;
    }

    public String getName(){
        return name;
    }

    public void hello(){
        System.out.println("我叫 "+name+"，今年 "+age+" 岁了!");
    }

    protected Human(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
