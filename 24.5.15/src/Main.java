import java.util.Arrays;

import java.util.Random;       //使用随机数需要载入util包里的Random

public class Main{
    public static void main(String[] args){
//每一个异常都是类，都继承于Exception类型
        /*
        test(1,0);    程序运行出现我们没有考虑到的情况时，就有可能出现异常或是错误
        Object object = null;
        System.out.println(object.toString());
        Object object = new Object();
        Main main = (Main) object;
         */
        //上述的列子，在编译阶段无法感知代码是否会出现问题，只有在运行的时候才知道会不会出错（正常情况下是不会出错的）
        // 这样的异常称为运行时异常，异常也是由类定义的，所有的运行时异常都继承自RuntimeException

        //test(1,0);

/*
异常的处理
当程序没有按照我们理想的样子运行而出现异常时（默认会交给JVM来处理，JVM发现任何异常都会立即终止程序运行，并在控制台打印栈追踪信息）
将代码编写到try语句块中，只要是在这个范围内发生的异常，都可以被捕获，使用catch关键字对指定的异常进行捕获
 */
        try {       //使用try-catch语句进行异常捕获
            Object object = null;
            object.toString();
        } catch (NullPointerException e){   //因为异常本身也是一个对象，catch中实际上就是用一个局部变量去接收异常
            //可以在catch语句块中对捕获到的异常进行处理
            e.printStackTrace();   //打印栈追踪信息
            System.out.println("异常错误信息："+e.getMessage());   //获取异常的错误信息
        }
        System.out.println("正常运行");
        //catch中捕获的类型只能是Throwable的子类，也就是说要么是抛出的异常，要么是错误
        //如果我们要捕获的异常，是某个异常的父类，那么当发生这个异常时，同样可以捕获到
        try {
            int[] arr = new int[1];
            arr[1] = 100;    //这里发生的是数组越界异常，它是运行时异常的子类
        } catch (RuntimeException e){  //使用运行时异常同样可以捕获到
            System.out.println("捕获到异常");
        }

        //多重异常捕获
        try {
            int[] arr1 = new int[1];
            arr1[-1] = 10;
        }catch(NullPointerException e1){
            System.out.println("空指针异常");
        }catch(ArrayIndexOutOfBoundsException  e2){
            System.out.println("数组越界异常");
        }catch(RuntimeException e3){    //捕获异常也是自上而下运行，当捕获到异常时，不会再往下运行，因此父类异常不要写在上方
            System.out.println("运行时异常");
        }finally{       //无论是否出现异常，都会在最后执行任务，可以交给finally语句块来处理
            System.out.println("finally");
            //finally之前也可以不写catch语句
            //try语句块至少要配合catch或finally中的一个
        }

        /*
        try {

        } catch (NullPointerException | IndexOutOfBoundsException e) {  //用|隔开每种类型即可
                //这样写只会用统一的方式处理括号内的异常
        }
         */

        //断言表达式需要使用到assert关键字，如果assert后面的表达式判断结果为false，将抛出AssertionError错误
        //assert false;

        System.out.println(Math.pow(5,7));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.abs(-1));
        System.out.println(Math.asin(1));
        System.out.println(Math.sin(Math.PI/2));
        System.out.println(Math.log(Math.E));    //e为底的对数函数，其实就是ln，我们可以直接使用Math中定义好的e
        System.out.println(Math.log10(100));     //10为底的对数函数
        //利用换底公式，我们可以弄出来任何我们想求的对数函数
        double a = Math.log(4) / Math.log(2);   //这里是求以2为底4的对数，log(2)4 = ln4 / ln2
        System.out.println(a);
        System.out.println(Math.ceil(4.6));     //向上取整
        System.out.println(Math.floor(5.4));    //向下取整

        Random random = new Random();
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextInt(100));
        System.out.println(random.nextLong());

        int[] arr = new int[]{1,4,5,78,67,4,2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[10];
        Arrays.fill(arr1, 66);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int[] target = Arrays.copyOfRange(arr2, 3, 5);   //也可以只拷贝某个范围内的内容
        System.out.println(Arrays.toString(target));
        System.out.println(arr2 == target);

        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        int[] target1 = new int[10];
        System.arraycopy(arr3, 0, target1, 0, 5);   //使用System.arraycopy进行搬运
        System.out.println(Arrays.toString(target1));

        int[] arr4 = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.binarySearch(arr4, 5));   //二分搜索仅适用于有序数组

        int[][] arr5 = new int[][]{{2, 8, 4, 1}, {9, 2, 0, 3}};
        System.out.println(Arrays.deepToString(arr5));    //deepToString方法可以对多维数组进行打印

        /*
        int[][] a = new int[][]{{2, 8, 4, 1}, {9, 2, 0, 3}};
        int[][] b = new int[][]{{2, 8, 4, 1}, {9, 2, 0, 3}};
        System.out.println(Arrays.equals(a, b));   //equals仅适用于一维数组
        System.out.println(Arrays.deepEquals(a, b));   //对于多维数组，需要使用deepEquals来进行深层次判断
         */

        
    }
    /*private static int test(int a, int b){
        return a/b;
    }*/

    /*private static int test(int a,int b){
        if (b == 0) throw new ArithmeticException("除数不能为零");    使用throw关键字来抛出异常
        return a/b; 运行时异常可以在方法中抛出（ArithmeticException是运行时异常），但是编译时异常需要在方法中生命该异常的出现
    }    */

    /*private static void test() throws Exception {    //使用throws关键字告知调用方此方法会抛出哪些异常，请调用方处理好
        throw new Exception("我是编译时异常！");
    }
    private static void test(int a) throws FileNotFoundException, ClassNotFoundException {  //多个异常使用逗号隔开
        if(a == 1)
            throw new FileNotFoundException();
        else
            throw new ClassNotFoundException();
    }*/

    //在重写方法时，如果父类中的方法表明了会抛出某个异常，只要重写的内容中不会抛出对应的异常我们可以直接省去
    /*
    @Override
    protected Object clone() {
        return new Object();
    }
     */

    /*public static void main(String[] args) throws IOException {  //继续编写throws往上一级抛
        test(10);
    }

    private static void test(int a) throws IOException {    //明确会抛出IOException
        throw new IOException();
    }*/

}