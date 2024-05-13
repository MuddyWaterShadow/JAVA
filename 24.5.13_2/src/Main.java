public class Main{
    public static void main (String[] args){
/*
一维数组
数组是相同类型数据的有序集合，数组可以代表任何相同类型的一组内容（包括引用类型和基本类型）其中存放的每一个数据称为数组的一个元素
类型[] 数组名;
类型[] 变量名称 = new 类型[数组大小];
类型 变量名称[] = new 类型[数组大小];  //支持C语言样式，但不推荐！

类型[] 变量名称 = new 类型[]{...};  //静态初始化（直接指定值和大小）
类型[] 变量名称 = {...};   //同上，但是只能在定义时赋值
 */
        int[] array1;   //类型[]就表示这个是一个数组类型
        array1 = new int[10];   //在创建数组时，需要指定数组长度，也就是可以容纳多个int变量的值
        Object obj1 = array1;   //因为同样是类，肯定是继承自Object的，所以说可以直接向上转型
        //创建出来的数组每个位置上都有默认值，如果是引用类型，就是null，如果是基本数据类型，就是0，或者是false，跟对象成员变量的默认值是一样的
        int a1 = array1[0];
        array1[0] = 888;   //就像使用变量一样，是可以放在赋值运算符左边的，我们可以直接给对应下标位置的元素赋值
        System.out.println("当前数组长度为："+array1.length);   //length属性是int类型的值，表示当前数组长度，长度是在一开始创建数组的时候就确定好的]

        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        equals(a,b);
        System.out.println(equals(a,b));
        for(int i : a) {
            System.out.print(i + " ");     //语法糖，简易版的for循环
        }
        System.out.println();
        /*
        对于基本类型的数组来说，是不支持自动装箱和拆箱的
        int[] arr = new int[10];
        Integer[] test = arr;
         */
        String[] arr1 = new String[10];
        Object[] arr2 = arr1;    //数组同样支持向上转型
        /*Object[] arr3 = new Object[10];
        String[] arr4 = (String[]) arr3;   //也支持向下转型
        将 'arr3' 转换为 'String[]' 会为任意非 null 值生成 'ClassCastException'
        ****************************
        */

        int[][] array2 = new int[2][3];
        int[][] array3 = new int[][] {{1,2},{3,4},{5,6}};   //一个三行两列的数组
        System.out.println(array2[1][1]+" "+array3[2][1]);
        for(int i = 0;i < array3.length;i++){
            for ( int j = 0;j < array3[i].length;j++){
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }

        test("1","2","3","4","5");  //这里我们可以自由传入任意数量的字符串

        /*
        for (String arg : args) {
            System.out.println(arg);
        }   //  java com/test/Main lbwnb aaaa xxxxx   #放在包中需要携带主类完整路径才能运行
         */

    }
    private static boolean equals(int[] a,int[] b){
        for(int i = 0;i < a.length;i++)
            if(a[i] != b[i]){
                System.out.println("第" + (i+1) +"个元素不同");
                return false;
            }
        System.out.println("两个数组相同");
        return true;

    }

    private static void test(String... str){    //实际上str就是数组
        for (String s : str) {      //输入str.for快速生成
            System.out.println(s);
        }
    }
    /*
    如果同时存在其他参数，那么可变长参数只能放在最后：
    public void test(int a, int b, String... strings){

    }
     */
}