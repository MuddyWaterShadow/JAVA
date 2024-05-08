public class Main{
    public static void main(String[] args) {
        int a1 = 666; //使用赋值运算符
        int a2 = 1 + 1; //使用算术运算符
        int a3 = 5;
        short b1 = 10;
        int c1 = a3 + b1;
        //不同类型的整数一起运算，小类型需要转换为大类型，short、byte、char一律转换为int再进行计算（无论算式中有无int，都需要转换），结果也是int；
        // 如果算式中出现了long类型，那么全部都需要转换到long类型再进行计算，结果也是long，反正就是依大的来
/*
short a = 5;
short e3 = 10;
short c = a + e3; //c必须是大于等于int的类型
 */
        String str1 = "Hello";
        String str2 = "World";
        int a4 = 20;
        char ch = '好';
        String str3 = str1 + str2 + a4 + ch; //20会自动转化为字符串,char类型的会显示单个字符而不是存储的数字
        System.out.println(str3);
        int a5 = 10;
        int a6 = 20;
        String str4 = "30";
        String str5 = a5 + a6 + str4; //优先进行int类型的加法运算，在遇上str4之后再转换为字符串
        //String str5 = str4 + a5 + a6; 这样写就是先遇上str4，转换成字符串，不会进行算术运算
        System.out.println(str5);
        int a7 = 8, b2 = 2;
        System.out.println(a7 * b2);   //乘法使用*表示乘号
        System.out.println(a7 / b2);   //除法就是一个/表示除号
        String str6 = "\n\"\'\\";   //转义字符\可以在char或者String类型中使用
        System.out.println(str6);
        int a8 = 8, b3 = 5;
        System.out.println(a8 / b3);    //两个整数在进行除法运算时，得到的结果也是整数（会直接砍掉小数部分，注意不是四舍五入）
        double a9 = 8, b4 = 5;  //直接赋值8是隐式转换到double类型（有没有性能上的损失？
        System.out.println(a9 / b4);
        System.out.println(17 % 2);
        System.out.println(10 + 3 * 4);
        int a10 = 10;
        int b5 = a10 = 8 * -a10 + 10;
/*
1. 正负号优先级最高，所有首先计算的是-a，得到-10
2. 其次是乘除号优先级更高，所以说这里计算 8 * -10，得到 -80
3. 然后是加减法，-80 + 10 = -70
4. 最后是赋值运算，因为等号运算符从右往左结合，先算a = -70的结果就是 -70
5. 最后b就是 -70
*/
        System.out.println(b5);
        int a11 = 10;
        int b6 = (a11 = 8) * (-a11 + 10);
/*
1. 括号的优先级是最高的，我们需要先计算括号中的内容，如果存在多个括号，就从左往右计算
2. 首先是 a = 8，计算完成之后a变成8，并且运算结果也为8
3. 然后是后面的加法，-a就是-8，加上10就是2
4. 最后才是乘法，左边此时是8，右边是2，最后结果为16
*/
        System.out.println(b6);
        int b7 = (2 + (3 + 1) * 3) * 2;    //在嵌套的情况下，会优先计算最内层括号中的算式
        System.out.println(b7);
        int a12 = 10;
        short b8 = (short) a12; //在括号中填写上强制转换的类型，就可以强制转换到对应的类型了
        System.out.println(b8);
        int a13 = 128;  //已经超出byte的范围了
        byte b9 = (byte) a13;   //此时强制类型转换为byte类型，那么只会保留byte能够表示的bit位
        System.out.println(b9);
/*
比如这里的128：
00000000 00000000 00000000 10000000 -> byte只有一个字节，所以说只保留最后8位 -> 10000000
这里的10000000，由于第一个位置是符号位，导致此时直接变成了byte的最小值：
 */
        int a14 = 8, b10 = 5;
        double c = a14 / (double) b10;
        //强制类型转换的优先级跟正负号一样
        //计算时，只需要将其中一者转换为double类型，此时按照隐式类型转换规则，全都会变成double参与运算，所以结果也就是小数了
        System.out.println(c);
/*
int a = 8, e3 = 5;
double c = (double) （a/e3）;
//将a/b的优先级提高了，再进行强制转换不会对结果造成影响
*/
        //自增自减运算符的优先级与正负号等价
        int d2 = 8;
        int e2 = -d2++ + ++d2;
        //我们首先来看前面的d2，因为正负号和自增是同一个优先级，结合性是从右往左，所以说先计算d2++
        //d2++的结果还是8，然后是负号，得到-8
        //接着是后面的a，因为此时d2已经经过前面变成9了，所以说++d2就是先自增，再得到10
        //最后得到的结果为 -8 + 10 = 2
        System.out.println(e2);
        //a += 4;   加号和等号连在一起，与a = a + 4效果完全一样
        //int a = 8;  int e3 = a += 4; +=的运算结果就是自增之后的结果,所以b就是12
        //a *= 9;   跟 a = a * 9 等价
/*
位运算符
位运算符直接以二进制形式操作目标，位运算符包括：& | ^ ~
 */
        int d3 = 9, e3 = 3;     //9 = 1001 , 3 = 0011
        int f1 = d3 & e3;    //进行按位与运算
        System.out.println(f1);
        int d4 = 9, e4 = 3;     //9 = 1001 , 3 = 0011
        int f2 = d4 | e4;    //进行按位或运算
        System.out.println(f2);
        int d5 = 9, e5 = 3;
        int f3 = d5 ^ e5;      //Java中并没有乘方运算符，^是按位异或运算符
        System.out.println(f3);
        byte f4 = ~127;
        System.out.println(f4);
        byte f5 = 1 << 2;    //两个连续的小于符号，表示左移运算
        System.out.println(f5);
        byte f6 = -4 >> 1;
        System.out.println(f6);
/*
左移操作<<： 高位直接丢弃，低位补0(左移操作一次相当于*2）
右移操作>>： 低位直接丢弃，符号位是什么高位补什么（右移操作一次相当于/2)
 */
        int f7 = -1 >> 1;   //正常的右移操作，高位补1，所以说移了还是-1
        System.out.println(f7);
        int f8 = -1 >>> 1;   //无符号右移是三个大于符号连在一起，移动会直接考虑符号位
        System.out.println(f8);     //不存在无符号左移
        int f9 = 1, f10 = 2, f11 = 4, f12 = 8, f13 = 1, f14 = 0;
        f14 &= (~-f9 + 1) * (f9 + 1) / -f10 + f11 << 4 - 3 << f12 ^ f13;
        System.out.println(f14);    //写着玩的，熟悉优先级
/*
关系运算符
>   大于
<   小于
==  等于（注意是两个等号连在一起，不是一个等号，使用时不要搞混了）
!=  不等于
>=  大于等于
<=  小于等于
逻辑运算符
&&     与运算，要求两边同时为true才能返回true
||     或运算，要求两边至少要有一个为true才能返回true
!      非运算，一般放在表达式最前面，表达式用括号扩起来，表示对表达式的结果进行反转
*/
        int g1 = 50;
        boolean h1 = g1 <= 100 && g1 >= 0;
        System.out.println(h1);
        boolean h2 = g1 >= 0 || ++g1 < 0;
        //逻辑运算符中，无论是与/或，都会因为第一个为假/真的情况下发生短路，后半句会不执行
        System.out.println(h2);
        System.out.println(g1);
        int g2 = 10;
        char h3 = g2 > 10 ? 'A' : 'B';   //三元运算符需要三个内容，第一个是判断语句，第二个是满足判断语句的值，第三个是不满足判断语句的值
        System.out.println(h3);
        {
            //我们可以在花括号中编写一句又一句的代码，实际上这些被大括号囊括起来的内容，我们就称为块（代码块）
            // 一个代码块中可以包含多行代码，我们可以在里面做各种各样的事情，比如定义变量、进行计算等等。
        }
        {   //自由创建代码块
            int x1 = 10;
            System.out.println(x1);
        }
        //System.out.println(x1); 在上一个代码块定义的局部变量无法在外层使用
        int x2 = 10;   //此时变量在最外层定义
        {
            System.out.println(x2);   //处于其作用域内部的代码块可以使用
        }
        System.out.println(x2);   //这里肯定也可以使用
/*
选择结构
if (条件判断) 判断成功执行的代码;
else if添加其他的条件判断 else 其他情况下的命令执行 （可不写）
 */
        int t1 = 10;
        if(t1 > 10)     //单if不带代码块只会决定后一行是否运行
            System.out.println("Hello World!");
            System.out.println("lbwnb");
        if(t1 == 10){
            System.out.println("Hello World!");
            System.out.println("lbwnb");
        }
        if(t1 > 10){
            System.out.println("t1大于10");
            System.out.println("t1 =" + t1);
        } else{
            System.out.println("t1小于等于10");
            System.out.println("t1 =" + t1);
        }
        int score=50;
        if(score>=90){
            System.out.println("成绩优秀");
        } else if(score>=70){
            System.out.println("成绩良好");
        } else if(score>=60){
            System.out.println("成绩合格");
        } else{
            System.out.println("成绩不合格");
        }
/*
switch (目标) {   //我们需要传入一个目标，比如变量，或是计算表达式等
case 匹配值:    //如果目标的值等于我们这里给定的匹配值，那么就执行case后面的代码
代码...
break;    //代码执行结束后需要使用break来结束，否则会溜到下一个case继续执行代码
default:   //一律就是下面的代码了
}
*/
        char test = 'A';
        switch(test) {
            case 'S':
                System.out.println("考试非常难");
                break;
            case 'A':
                System.out.println("考试比较难");
                break;
            case 'B':
                System.out.println("考试难度适中");
                System.out.println("好耶");
                break;
            default:
                System.out.println("考试简单");
        }
/*
循环结构
for (表达式1;表达式2;表达式3) 循环体;
介绍一下详细规则：
表达式1：在循环开始时仅执行一次。
表达式2：每次循环开始前会执行一次，要求为判断语句，用于判断是否可以结束循环，若结果为真，那么继续循环，否则结束循环。
表达式3：每次循环完成后会执行一次。
循环体：每次循环都会执行一次循环体。
 */
        for (int i = 0; i < 3; i++)    //这里我们在for语句中定义一个变量i，然后每一轮i都会自增，直到变成3为止
            System.out.println("伞兵一号卢本伟准备就绪！");   //这样，就会执行三轮循环，每轮循环都会执行紧跟着的这一句打印
        /*
        int i = 0;   //在外面创建变量i，这样全部范围内都可以使用了
        for (; i < 3; i++) {   //for循环的三个表达式并不一定需要编写
            System.out.println("伞兵一号卢本伟准备就绪！");
            System.out.println("当前i的值为："+i);
        }
        System.out.println("当前i的值为："+i);

         */
        for (int i = 0; i < 3; i++)    //外层循环执行3次
            for (int j = 0; j < 3; j++)    //内层循环也执行3次
                System.out.println("1！5！");
        /*
        for (;;)   //如果什么都不写，相当于没有结束条件，这将会导致无限循环
            System.out.println("伞兵一号卢本伟准备就绪！");
         */
        for (int i = 0; i < 3; i++) {
            if(i == 1) continue;   //比如我们希望当i等于1时跳过这一轮，不执行后面的打印
            System.out.println("伞兵一号卢本伟准备就绪！");
        }
        System.out.println("嘟嘟噜");
        for (int i = 0; i < 3; i++) {
            if (i == 1) break;   //我们希望当i等于1时提前结束
            System.out.println("伞兵一号卢本伟准备就绪！");
        }
        /*
        continue关键字跳过本轮循环
        break关键字提前终止整个循环
         */
        for (int i = 1; i < 4; ++i) {
            for (int j = 1; j < 4; ++j) {
                if(i == j) continue;    //当i == j时加速循环
                System.out.println(i+", "+j);
            }
        }
        System.out.println("嘟嘟噜");
        for (int i = 1; i < 4; ++i) {
            for (int j = 1; j < 4; ++j) {
                if(i == j) break;    //当i == j时终止循环
                System.out.println(i+", "+j);
            }
        }
        outer: for (int i = 1; i < 4; ++i) {   //在循环语句前，添加 标签: 来进行标记
            inner: for (int j = 1; j < 4; ++j) {
                if(i == j) break outer;    //break后紧跟要结束的循环标记，当i == j时终止外层循环
                System.out.println(i+", "+j);
            }
        }
        one: {    //直接对整个代码块打标签
            for (int i = 0; i < 10; i++) {
                if (i == 7){
                    System.out.println("Test");
                    break one;   //执行break时，会直接跳出整个代码块，而不是第一个循环
                }
            }

            System.out.println("？？？");
        }
        //标签：循环体/代码块
/*
while(循环条件) 循环体;
先执行循环内容，然后再做循环条件判断，这里要用到do-while语句
 */
        {
            int i = 0;
            while(i<100){
                i++;
                if(i<50) continue;
                else if(i>=90) continue;
                System.out.println(i);
            }

        }
        {
            int i = 0;   //比如现在我们想看看i不断除以2得到的结果会是什么，但是循环次数我们并不明确
            do {  //无论满不满足循环条件，先执行循环体里面的内容
                System.out.println(i);
                i++;
            } while (i < 10);   //再做判断，如果判断成功，开启下一轮循环，否则结束
        }
    }
}