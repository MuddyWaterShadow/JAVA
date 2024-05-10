public class Main{
    public static void main(String[] args) {
        /*Person p = new Person("小明",20,"男");
        System.out.println(p.getName());
        */
        Person p = Person.getInstance("小明",20,"男");
        System.out.println(p.getName());

        Human h = new Human("",20,"");
        h.setName("大明");
        h.getName();
        System.out.println(h.name);
        Student s = new Student("",18,"");
        s.name = "好好好";
        s.study();  //子类自己的方法
        s.hello();  //继承了父类的方法
        Human h1 = new Student("小明", 18, "男");    //这里使用父类类型的变量，去引用一个子类对象（向上转型）
        h1.hello();    //父类对象的引用相当于当做父类来使用，只能访问父类对象的内容
        Student s1 = (Student) h1;  //使用强制类型转换（向下转型）
        s1.study();
        //如果变量所引用的对象是对应类型或是对应类型的子类，那么instanceof都会返回true，否则返回false
        if (h1 instanceof Student){
            System.out.println("属于Student");
        }
        if (h1 instanceof Worker){
            System.out.println("属于Worker");
        }
        Worker w = new Worker("好人" , 18 , "");
        w.work();
    }
}