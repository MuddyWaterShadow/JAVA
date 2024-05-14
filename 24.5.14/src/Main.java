import entity.Study;
import entity.Test;

import entity.Water;

import entity.Student;

import entity.Study;

import entity.Read;

import entity.Sum;

import entity.Write;

import javax.xml.namespace.QName;

public class Main{
    public static void main(String[] args){
        String str1 = "Hello";      //用双引号括起来的字符串，是String类型的一个实例对象
        String str2= new String("Hello");
        System.out.println(str1 == str2);   //不要使用==判断内容相同
        System.out.println(str1.equals(str2));
        System.out.println(str1.length());
        System.out.println("Hello".length());
        String str3 = "Hello".substring(0,3);       //从0开始，但不包含3表示的字符
        System.out.println(str3);
        String str4 = "Hello World";
        String[] str5 = str4.split(" ");
        for (String s : str5) {
            System.out.println(s);
        }
        System.out.println(str4.contains("ello"));
        System.out.println(str4.charAt(0));     //找到字符串的第0个位置上的字符
        System.out.println(str4.toLowerCase());     //将字符串小写
        System.out.println(str4.toUpperCase());     //将字符串大写
        System.out.println(str4.startsWith("Hel"));     //判断字符串是否以Hel开头
        System.out.println(str4.indexOf("l"));      //找到l在字符串中的位置
        System.out.println(str4.lastIndexOf("l"));      //找到最后一个l在字符串的位置
        System.out.println(str4.indexOf("l",3));        //从第三个字符之后（从位置3）开始找l的位置
        String str6 = "";
        System.out.println(str6.isEmpty());

        String s1 = "哎";
        String s2 = "哟";
        String s3 = "你";
        String s4 = "干";
        String s5 = "嘛";
        String str7 = s1 + s2 + s3 + s4 + s5;
        System.out.println(str7);
        //为了防止在进行字符串相加运算的时候，利用4个变量存储相加后的结果
        //这种情况实际上会被优化为下面的写法
        /*
        StringBuilder builder = new StringBuilder();
        builder.append(s1).append(s2).append(s3).append(s4).append(s5);
        System.out.println(builder.toString());
         */
        StringBuilder b1 = new StringBuilder();
        b1.append("ABCDEF");
        StringBuilder b2 = new StringBuilder("AAABBB");   //在构造时也可以指定初始字符串
        b1.delete(2, 4);   //删除从2开始到4之前这个范围内的字符
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        StringBuilder str8 = b1.replace(0,3,"1");      //把从0开始到3之前的字符替换为1
        System.out.println(str8.toString());
        String str9 = "Hello World";
        String str10 = str9.replace("Hello","Goodbye");
        System.out.println(str10);
        System.out.println(str9.replace('o','i'));
/*
正则表达式
对于给定的字符串进行判断，如果字符串符合我们的规则，那么就返回真，否则返回假
用于规定给定组件必须要出现多少次才能满足匹配的，我们一般称为限定符，限定符表如下：

*
匹配前面的子表达式零次或多次。例如，zo* 能匹配 "z" 以及 "zoo"。***** 等价于 {0,}。
+
匹配前面的子表达式一次或多次。例如，zo+ 能匹配 "zo" 以及 "zoo"，但不能匹配 "z"。+ 等价于 {1,}。
?
匹配前面的子表达式零次或一次。例如，do(es)? 可以匹配 "do" 、 "does"、 "doxy" 中的 "do" 。? 等价于 {0,1}。
{n}
n 是一个非负整数。匹配确定的 n 次。例如，o{2} 不能匹配 "Bob" 中的 o，但是能匹配 "food" 中的两个 o。
{n,}
n 是一个非负整数。至少匹配n 次。例如，o{2,} 不能匹配 "Bob" 中的 o，但能匹配 "foooood" 中的所有 o。o{1,} 等价于 o+。o{0,} 则等价于 o*。
{n,m}
m 和 n 均为非负整数，其中 n <= m。最少匹配 n 次且最多匹配 m 次。例如，o{1,3} 将匹配 "fooooood" 中的前三个 o。o{0,1} 等价于 o?。请注意在逗号和两个数之间不能有空格。
————————————————
[ABC]
匹配 [...] 中的所有字符，例如 [aeiou] 匹配字符串 "google runoob taobao" 中所有的 e o u a 字母。
[^ABC]
匹配除了 [...] 中字符的所有字符，例如 [^aeiou] 匹配字符串 "google runoob taobao" 中除了 e o u a 字母的所有字母。
[A-Z]
[A-Z] 表示一个区间，匹配所有大写字母，[a-z] 表示所有小写字母。
匹配除换行符（\n、\r）之外的任何单个字符，相等于 [^\n\r]
[\s\S]
匹配所有。\s 是匹配所有空白符，包括换行，\S 非空白符，不包括换行。
\w
匹配字母、数字、下划线。等价于 [A-Za-z0-9_]

 */
        String s6 = "aaaa731341@163.com";
        String s7 = "@@@@";
        //假设邮箱格式为 数字/字母@数字/字母.com
        System.out.println(s6.matches("@+"));
        System.out.println(s7.matches("@+"));
        String s8 = "acbabcabcbbbca ";
        System.out.println(s8.matches("[abc]*"));

        Test t1 = new Test("小明");
        Test.Inner i1 = t1.new Inner();
        i1.inner();
        Test t2 = new Test("小明");
        Test.Info i2 = t2.new Info("中明");
        i2.info("大明");

        Test.Water w1 = new Test.Water();
        w1.water();

        Water.Test.test();

//匿名内部类和匿名接口相当于子类
        Student stu1 = new Student(){
            @Override
            public void test(){
                System.out.println("匿名内部类" + name);
            }
        };
        stu1.test();

        Study stu2 = new Study(){
            @Override
            public void study(){
                System.out.println("匿名接口");
            }
        };
        stu2.study();

/*
Lambda表达式
特别的，如果一个接口中有且只有一个待实现的抽象方法，可以将匿名内部类简写为Lambda表达式
Lambda表达式的具体规范：
标准格式为：([参数类型 参数名称,]...) ‐> { 代码语句，包括返回值 }
和匿名内部类不同，Lambda仅支持接口，不支持抽象类
接口内部必须有且仅有一个抽象方法（可以有多个方法，但是必须保证其他方法有默认实现，必须留一个抽象方法出来）
 */
        Study stu3 = () -> {
            System.out.println("111");
        };
        stu3.study();

        Read r1 = new Read(){
            @Override
            public int read(int a){
                System.out.println(a);
                return a;
            }
        };
        r1.read(1);

        Read r2 = (int a) -> {
            System.out.println(a);
            return a;
        };
        r2.read(2);
        //如果匿名内部类或者匿名接口需要使用外部的变量，那么这个变量需要是final或者隐式final（即没有进行过修改）

//方法引用本质上就相当于将其他方法的实现，直接作为接口中抽象方法的实现
        Sum sum1 = (a , b)-> a + b;
        Sum sum2 = (a , b)-> Integer.sum(a , b);
        Sum sum3 = Integer::sum;
        System.out.println(sum1.sum(10,20));

        Main main = new Main();
        Write write = main::lbwnb;
        System.out.println(write.write());

        //Write write= String::new;    构造方法也可以被引用，使用new表示
    }
    public String lbwnb(){
        return "全体起立";
    }
}