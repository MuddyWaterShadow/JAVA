import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main{
    public static void main(String[] args){
/*
包装类实际上就是将我们的基本数据类型，封装成一个类（运用了封装的思想）
其中能够表示数字的基本类型包装类，继承自Number类，对应关系如下表：
byte -> Byte
boolean -> Boolean
short -> Short
char -> Character
int -> Integer
long -> Long
float -> Float
double -> Double
 */
        Integer i1 = new Integer(10);     //将10包装为一个Integer类型的变量
        System.out.println(i1);
        //Integer i2 = Integer.valueOf(10);  可以改成下一行的形式，自动拆箱，反向为自动装箱
        Integer i2 = 10;
        System.out.println(i2);
        int i3 =  i2; //int i3 = i2.intValue();
        System.out.println(i3);
        Integer i4 = new Integer(10);
        Integer i5 = 10;
        System.out.println(i1 == i4);
        System.out.println(i2 == i5);
        /*
        通过自动装箱转换的Integer对象，如果值相同，得到的会是同一个对象，这是因为：
        public static Integer valueOf(int i) {
            if (i >= IntegerCache.low && i <= IntegerCache.high)   //这里会有一个IntegerCache，如果在范围内，那么会直接返回已经提前创建好的对象
                return IntegerCache.cache[i + (-IntegerCache.low)];     //IntegerCache会默认缓存-128~127之间的所有值，将这些值提前做成包装类放在数组中存放
            return new Integer(i);
        }
         */
        Integer i6 = 129;
        Integer i7 = 129;
        System.out.println(i6 == i7);   //此处为false是因为提取的数字不是数组中存放好的数字，而是重新引用的

        String s1 = "666";
        Integer i8 = Integer.valueOf(s1);
        Integer i9 = Integer.parseInt(s1);
        Integer i10 = new Integer(s1);
        Integer i11 = Integer.decode("0xAA");   //对十六进制和八进制进行解码，得到十进制
        Integer i12 = Integer.decode("077");
        System.out.println(i11);
        System.out.println(i12);
        System.out.println("0x" + Integer.toHexString(16));     //将十进制转化成为16进制
        System.out.println(i1.equals(i4));
        System.out.println(Integer.compare(i1,i4));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        i1 = 1;
        Void v = null;      //Void类型无法用new
/*
特殊包装类
用于计算超大数字的BigInteger
用于表示精确小数的BigDecimal
 */
        BigInteger b1 = BigInteger.valueOf(Long.MAX_VALUE);
        b1 = b1.multiply(b1);
        //b1 = b1.pow(100);   100次方
        System.out.println(b1);

        BigDecimal b2 = BigDecimal.valueOf(10);
        b2 = b2.divide(BigDecimal.valueOf(3),100, RoundingMode.CEILING);
        //计算10/3的结果，精确到小数点后100位
        //RoundingMode是舍入模式，就是精确到最后一位时，该怎么处理，这里CEILING表示向上取整
        System.out.println(b2);


    }
}