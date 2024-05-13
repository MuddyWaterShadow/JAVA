public class Worker extends Person implements Study,Cloneable{      //首先实现Cloneable接口，表示这个类具有克隆的功能
    public Worker(String name,int age,String sex){
        super(name,age,sex);
    }

    @Override
    public void test() {
        super.test();       //希望调用父类原本的方法实现，那么同样可以使用super关键字
        System.out.println("我是工人");
    }


    void sum(){

    }

    @Override
    void exam() {
        System.out.println("我要考工");
    }       //具体的实现，需要由子类来完成，而且如果是子类，必须要实现抽象类中所有抽象方法
    //子类必须要实现抽象类所有的抽象方法，这是强制要求的，否则会无法通过编译

    public void study(){
        System.out.println("1");         //实现接口时，同样需要将接口中所有的抽象方法全部实现
    }

    @Override
    public Object clone() throws CloneNotSupportedException {       //将protected改成public，提高权限
        return super.clone();
    }
}
