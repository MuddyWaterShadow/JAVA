public class Main{
    public static void main(String[] args){
/*
类的定义与对象创建
new 类名();
 */
        new Person();   //我们可以使用new关键字来创建某个类的对象，注意new后面需要跟上 类名()
        //这里创建出来的，就是一个具体的人了
/*
使用一个变量来指代某个对象，只不过引用类型的变量，存储的是对象的引用，而不是对象本身
 */
        //这里的a存放的是具体的某个值
        int a = 10;
        //创建一个变量指代我们刚刚创建好的对象，变量的类型就是对应的类名
        //这里的p存放的是对象的引用，而不是本体，我们可以通过对象的引用来间接操作对象
        /*
        Person p = new Person();
        p.name = "小明";
        p.age = 18;
        p.sex = "武装直升机";
        System.out.println(p.name + '\n' + p.age + '\n' + p.sex);
         */
        /*
        Person p1 = new Person();
        Person p2 = p1;     //将变量p2赋值为p1的值，那么实际上只是传递了对象的引用，而不是对象本身的复制,p2和p1都指向的是同一个对象
        System.out.println(p1 == p2);    //使用 == 可以判断两个变量引用的是不是同一个对象
         */
        /*
        Person p1 = new Person();   //这两个变量分别引用的是不同的两个对象
        Person p2 = new Person();   //相当于p1与p2都引用了person类，但是p1与p2指向的是不同的两个人
        System.out.println(p1 == p2);   //如果两个变量存放的是不同对象的引用，那么肯定就是不一样的了
         */
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "小明";   //这个修改的是第一个对象的属性
        p2.name = "大明";   //这里修改的是第二个对象的属性
        System.out.println(p1.name);  //这里我们获取的是第一个对象的属性
        /*
        Person p = null;   //此时变量没有引用任何对象,null是一个特殊的值，它表示空，也就是不引用任何的对象
        p.name = "小红";
        System.out.println(p.name);
         */
        Person p = new Person();
        System.out.println("name = "+p.name);
        System.out.println("age = "+p.age);
        System.out.println("sex = "+p.sex);
        //直接创建对象，那么对象的属性都会存在初始值，如果是基本类型，那么默认是统一为0（如果是boolean的话，默认值为false）如果是引用类型，那么默认是null
        Person p3 = new Person();
        p3.name = "muddy water";
        p3.age = 20;
        p3.hello();
        int reslut = p3.sum(10,20);     //方法定义时编写的参数，我们一般称为形式参数，而调用方法实际传入的参数，我们成为实际参数。
        System.out.println(reslut);
        //参数的传递问题
        int a1 = 5, b1 = 9;   //外面也叫a和b
        p.swap(a1, b1);
        System.out.println("a = "+a1+", b = "+b1);   //最后的结果会变成什么样子呢？
        p.name = "小明";     //先在外面修改一次
        p.modify(p);        //调用方法再修改一次
        System.out.println(p.name);    //请问最后name会是什么？
/*
方法进阶使用
 */
        p.setName("大明");
        System.out.println(p.name);
        System.out.println(p.sum(1.5,9.0));

        System.out.println(p.test(100));
    }
}