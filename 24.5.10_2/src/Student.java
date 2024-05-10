public class Student extends Human{
    public void study(){
        System.out.println("我的名字是 "+name+"，我在学习！");   //可以直接访问父类中定义的name属性
    }
    public Student(String name,int age, String sex){
        super(name,age,sex);
    }


}
