public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {      //这里向上抛出一下异常
//所有类都默认继承自Object类，除非手动指定继承的类型
/*
private static native void registerNatives();   //标记为native的方法是本地方法，底层是由C++实现的
    static {
        registerNatives();   //这个类在初始化时会对类中其他本地方法进行注册，本地方法不是我们SE中需要学习的内容，我们会在JVM篇视频教程中进行介绍
    }

    //获取当前的类型Class对象，这个我们会在最后一章的反射中进行讲解，目前暂时不会用到
    public final native Class<?> getClass();

    //获取对象的哈希值，我们会在第五章集合类中使用到，目前各位小伙伴就暂时理解为会返回对象存放的内存地址
    public native int hashCode();

  	//判断当前对象和给定对象是否相等，默认实现是直接用等号判断，也就是直接判断是否为同一个对象
  	public boolean equals(Object obj) {
        return (this == obj);
    }

    //克隆当前对象，可以将复制一个完全一样的对象出来，包括对象的各个属性
    protected native Object clone() throws CloneNotSupportedException;

    //将当前对象转换为String的形式，默认情况下格式为 完整类名@十六进制哈希值
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    //唤醒一个等待当前对象锁的线程，有关锁的内容，我们会在第六章多线程部分中讲解，目前暂时不会用到
    public final native void notify();

    //唤醒所有等待当前对象锁的线程，同上
    public final native void notifyAll();

    //使得持有当前对象锁的线程进入等待状态，同上
    public final native void wait(long timeout) throws InterruptedException;

    //同上
    public final void wait(long timeout, int nanos) throws InterruptedException {
        ...
    }

    //同上
    public final void wait() throws InterruptedException {
        ...
    }

    //当对象被判定为已经不再使用的“垃圾”时，在回收之前，会由JVM来调用一次此方法进行资源释放之类的操作，这同样不是SE中需要学习的内容，这个方法我们会在JVM篇视频教程中详细介绍，目前暂时不会用到
    protected void finalize() throws Throwable { }
}
 */
        //toString方法
        //将当前对象转换为String的形式，默认情况下格式为 完整类名@十六进制哈希值
        /*Person p1 = new Person("",18,"");
        String str1 = p1.toString();
        System.out.println(p1.toString());
        System.out.println(str1);
        System.out.println(p1);*/

        //equals方法
        //判断当前对象和给定对象是否相等，默认实现是直接用等号判断，也就是直接判断是否为同一个对象
        /*Person p2 = p1;
        Person p3 = new Person("",18,"");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));*/
        //以上是equals方法未重写，可以去Person类中注释掉重写内容
/*
方法的重写
方法的重写不同于之前的方法重载，方法的重载是为某个方法提供更多种类，而方法的重写是覆盖原有的方法实现
 */
        /*Person p4 = new Person("",18,"");
        Person p5 = new Person("",18,"");
        Object p6 = new Person("",18,"");
        Object p7 = new Person("",18,"");
        System.out.println(p4.equals(p5));
        System.out.println(p6.equals(p7));
        System.out.println(p5.equals(p6));

        Person p8 = new Person("",18,"");
        Person p9 = new Student("",18,"");
        Person p10 = new Worker("",18,"");
        p8.test();
        p9.test();
        p10.test();*/
        //基于这种方法可以重写的特性，对于一个类定义的行为，不同的子类可以出现不同的行为

        //Person p = new Person("",18,""); 抽象类由于不是具体的类定义（它是类的抽象）可能会存在某些方法没有实现，因此无法直接通过new关键字来直接创建对象
        /*
        public class Student extends Person implements Study, A, B, C {  //多个接口的实现使用逗号隔开

        }
         */
        Study s = new Worker("",18,"");
        s.study();
        if(s instanceof Worker) {   //直接判断引用的对象是不是Wro类型
            Worker w = (Worker) s;   //强制类型转换
            w.study();
        }
        Worker w = new Worker("",18,"");
        w.test();
        w.test1();

        Worker clone = new Worker("1",1,"1");
        Worker s1 = (Worker) clone.clone();     //调用clone方法，得到一个克隆的对象

        System.out.println(s1);
        System.out.println(clone);
        System.out.println(s1 == clone);

        Human h1 = new Human();
        h1.setStatus(Status.RUNNING);
        System.out.println(h1.getStatus());
        Status s2 = Status.valueOf("SLEEP");
        System.out.println(s2);


        Human h2 = new Human();
        h2.setStatus(Status.STUDY);
        System.out.println(h2.getStatus());
        String s3 = h2.getStatus().getName();
        String s4 = h2.getStatus().name();
        System.out.println(s3);
        System.out.println(s4);
    }
}