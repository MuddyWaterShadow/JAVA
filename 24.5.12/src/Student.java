public class Student extends Person{
    public Student(String name,int age,String sex){
        super(name,age,sex);
        this.name = super.name;
        System.out.println(this.name);
    }

    @Override
    public void test() {        //子类在重写的时候，访问权限只能高于等于父类，不能低于父类
        System.out.println("我是学生");
    }   //静态方法不支持重写，因为它是属于类本身的，但是它可以被继承

    @Override
    void exam() {
        System.out.println("我要考试");
    }
}
