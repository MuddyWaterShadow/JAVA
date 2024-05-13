public abstract class Person {      //通过添加abstract关键字，表示这个类是一个抽象类
    String name;
    int age;
    String sex;
    public Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override ////重写方法可以添加 @Override 注解，这个注解默认情况下可以省略
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj instanceof Person){
            Person person = (Person) obj;   //先转换为当前类型，接着我们对三个属性挨个进行比较
            return this.name.equals(person.name) && //字符串内容的比较，不能使用==，必须使用equals方法，字符串不是基本数据类型
                    this.age == person.age &&
                    this.sex.equals(person.sex);
        }
        return false;
    }

    //为了方便查看类中的属性，重写toString方法。
    @Override
    public String toString() {      //使用IDEA可以快速生成（输入toString，通过向导生成
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    void test(){
        System.out.println("111");
    }

    final void info(){
        //final关键字表示该方式是最终形态，不能被重写(在类前面是不能被继承
    }


    private void sum(){
        //如果父类中方法的可见性为private，那么子类同样无法访问，也就不能重写，但是可以定义同名方法
    }

    abstract void exam();      //抽象类中可以具有抽象方法，也就是说这个方法只有定义，没有方法体


}
