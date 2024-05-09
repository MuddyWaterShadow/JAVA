public class Person {
    //这里定义的人类具有三个属性，名字、年龄、性别,这些属性直接作为类的成员变量
    String name;        //直接在类中定义变量，表示类具有的属性
    int age;
    String sex;
/*
方法创建与使用
返回值类型 方法名称() {
		方法体...
}
 */
    void hello(){
        //完成自我介绍需要执行的所有代码就在这个花括号中编写
        //这里编写代码跟我们之前在main中是一样的（实际上main就是一个函数）
        //自我介绍需要用到当前对象的名字和年龄，我们直接使用成员变量即可，变量的值就是当前对象的存放值
        System.out.println("我叫 "+name+" 今年 "+age+" 岁了！");
    }
    //我们的方法需要别人提供参与运算的值才可以
    //我们可以为方法设定参数，在调用方法时，需要外部传入参数才可以
    //参数的定义需要在小括号内部编写，类似于变量定义，需要填写 类型和参数名称，多个参数用逗号隔开
    int sum(int a, int b){   //这里需要两个int类型的参数进行计算, 这里的参数，相当于我们在函数中定义了两个局部变量，我们可以直接在方法中使用
        int c = a + b ;
        System.out.println("调用了int类型");
        return c;      //return后面紧跟需要返回的结果，这样就可以将计算结果丢出去了
        //带返回值的方法，是一定要有一个返回结果的！否则无法通过编译！
        //return a + b; 同理
        //System.out.println("hello"); return关键字之后，方法就会直接结束并返回结果，所以说在这之后编写的任何代码，都是不可到达的
    }
    /*
    String num(int a){
        if(a>10){
            return "大于10";
        } else{
            return "小于等于10"；
            如果我们的程序中出现了分支语句，那么必须保证每一个分支都有返回值才可以：
        }
    }
     */
    void swap(int a, int b){   //这个函数的目的很明显，就是为了交换a和b的值
        int tmp = a;
        a = b;
        b = a;
    }
    void modify(Person person){
        person.name = "lbwnb";   //修改对象的名称
    }
    void setName(String name){
        this.name = name;       //this关键字，来明确表示当前类的示例对象本身
    }   //方法内没有变量出现重名的情况，那么默认情况下可以不使用this关键字来明确表示当前对象
    String getName(){
        return name;    //这里没有使用this，但是当前作用域下只有对象属性的name变量，所以说直接就使用了
        //return this.name;
    }
    double sum(double a,double b){          //为了让这个方法支持使用小数进行计算，我们可以将这个方法进行重载
        System.out.println("调用double类型");
        return a + b;
    }   //当方法出现多个重载的情况，在调用时会自动进行匹配，选择合适的方法进行调用
    //double sum(int a, int b)  仅返回类型不同，是不允许的
    void test(){
        System.out.println("我是test");   //实际上这里也是调用另一个方法
    }

    void say(){
        test();   //在一个方法内调用另一个方法
    }   //方法之间是可以相互调用的

    int test(int n){
        if(n == 0) return 0;
        return test(n - 1) + n;    //返回的结果是下一层返回的结果+当前这一层的n
    }   //自己调用自己的行为，称为递归调用
}
