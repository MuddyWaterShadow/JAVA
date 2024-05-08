/**
 * @author muddy water
 * @since 2024/5/7 or 2024.5.7
 */
public class Main{
    public static void main(String[] args){
        /*
        这个符号中的内容是多行注释
         */

        System.out.        println("Hello World!");     //这段代码是为了打印Hello World！且换行
        System.out.
                print("Hello World!");       //这段代码是为了打印Hello World！且不换行
        System.out.println("Hello World!");
        int x3_$;
        int x;
        int X;
        int parameter_math;
        int parameterMath;
        int b;      //声明一个整型变量b
        int B=10;      //声明一个整型变量B，并赋值10
        //System.out.println(b);
        System.out.println(B);
        B=12;
        System.out.println(B);
        int p,d;
        int e = B;
        B = B + 1;
        B = B - 1;
        System.out.println(888);
        final int last = 5;  //final关键字会让这个变量成为一个常量，只有第一次可以修改
        //last = 10;    //使用final关键字之后无法对这个变量实行二次修改，因为本质上它成为了一个常量
        final int one;
        one = 1;
        //one = 10;
        System.out.println(one);
/*
计算机中的二进制表示
1+1=10=2^1+0
1111=2^3+2^2+2^1+0
一个位也叫一个bit
8个bit被称为一个字节 8bit=1Byte
16个bit为一个字
32个bit为一个双字
64个bit为一个四字
在java中，无论是小数还是整数，都是带符号数。需要首位的bit位代表符号（1为负数，0为正数）
7=0111这种表示形式是原码，为了便于计算机进行计算，我们引入反码这个概念
反码：正数的反码就是它本身
     负数的反码是符号位不变，各个位置取反
1+（-1）= 0001 + 1110 = 1111（此为反码，原码的形式是1000） = -0
但是1000=-0，0000=+0，不太合理，因此引入了补码
补码：正数的补码就是它本身
     负数的补码是先取反码再+1
因此补码中1000表示的是-8
1 + （-1） = 0001 + 1111 = （1）0000 （不会出现-0的情况了）
 */
        byte a1 = 1; //1个字节
        short a2; //2个字节
        int a3 = 1; //4个字节
        long a4; //8个字节
        a2 = a1; //从存储范围小的类型赋值到存储范围大的类型时，支持隐式类型转换(除了整数类型也能发生在别的数据类型之间)
        //a2 = a3;
        byte a5 = 10;    //这里的整数常量10，实际上默认情况下是int类型，但是由于正好在对应类型可以表示的范围内，所以说直接转换为了byte类型的值
        long a6 = 2342342345235L;       //数字最后的L/l表示该数字是long类型
        long a7 = 1000000;
        long a8 = 1_000_000;//当然这里依然表示的是1000000，没什么区别，但是辨识度会更高
        System.out.println(0xA);//十六进制： 以0x开头的都是十六进制表示法
        System.out.println(012);//八进制： 以0开头的都是八进制表示法
/*
浮点类型：
float单精度浮点型（32bit，4个字节)
double双精度浮点型（64bit，8个字节）
根据国际标准 IEEE 754，任意一个二进制浮点数 V 可以表示成下面的形式：
            𝑉=[(−1)^𝑆]×𝑀×(2^𝐸)
(−1)^S 表示符号位，当 S=0，V 为正数；当 S=1，V 为负数。
M 表示有效数字，大于等于 1，小于 2，但整数部分的 1 不变，因此可以省略。（例如尾数为1111010，那么M实际上就是1.111010，尾数首位必须是1，1后面紧跟小数点，如果出现0001111这样的情况，去掉前面的0，移动1到首位；
题外话：随着时间的发展，IEEE 754标准默认第一位为1，故为了能够存放更多数据，就舍去了第一位，比如保存1.0101 的时候， 只保存 0101，这样能够多存储一位数据）
2^E表示指数位。（用于移动小数点，所以说才称为浮点型）

 */
        double a9 = 10.5, a10 = 66;   //整数类型常量也可以隐式转换到浮点类型
        float f = 9.9F;   //给常量后面添加大写或小写的F来表示这是一个float类型的常量值
        //float f= 9.9; 跟整数类型常量一样，小数类型常量默认都是double类型
        float f1 = 9.9F;
        double a11 = f1;    //隐式类型转换为double值
        System.out.println(a11); //这种情况是正常的，因为浮点类型并不保证能够精确计算，BigDecimal更适合需要精确计算的场景。
        long l = 21731371236768L;
        float f2 = l;   //这里能编译通过吗？
        System.out.println(f2);
        //此时我们发现，long类型的值居然可以直接丢给float类型隐式类型转换，很明显float只有32个bit位，而long有足足64个，这是什么情况？怎么大的还可以隐式转换为小的？
        //这是因为虽然float空间没有那么大，但是由于是浮点类型，指数可以变化，最大的数值表示范围实际上是大于long类型的，虽然会丢失精度，但是确实可以表示这么大的数。
        //总结一下隐式类型转换规则：byte → short(char) →int → long → float → double
/*
字符类型：
char 字符型（16个bit，也就是2字节，它不带符号）范围是0 ~ 65535
String类型，这种类型并不是基本数据类型，它是对象类型
 */
        char c = 65; //字母A在ASCII中是65
        System.out.println(c);
        char c1 = 'A';
        int c2 = c1;
        System.out.println(c1);
        System.out.println(c2);
        char c3 = '好';
        int c4 = '好';
        //char c5 = 'hao'; 单个字符
        //char c6 = h;
        System.out.println(c3);
        System.out.println(c4);
        char 你好 = '草';
        System.out.println(你好);
        //Java程序在编译为.class文件之后，会采用UTF-8的编码格式，支持的字符也非常多，所以你甚至可以直接把变量名写成中文，依然可以编译通过：
        String hhh = "你好hhh";
        System.out.println(hhh);
/*
布尔类型 boolean
布尔类型是Java中的一个比较特殊的类型，它并不是存放数字的，而是状态，它有下面的两个状态：
true - 真
false - 假
 */
        boolean d1 = true;   //值只能是true或false
        //boolean d2 = 666;
        System.out.println(d1);
    }
}
