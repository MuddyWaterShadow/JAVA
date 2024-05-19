import java.util.Optional;

public class Main{
    public static void main(String[] args){
        Score<String> score = new Score<>("小明","114514","优秀");
        //因为现在有了类型变量，在使用时同样需要跟上<>并在其中填写明确要使用的类型，后面那个可以省略
        System.out.println(score.getValue());

        String str = test("1234");
        //泛型的上界和下界
        Score<? extends Number> score1 = new Score<>("数据结构与算法基础", "EP074512", 10);
        Number o1 = score1.getValue();   //可以看到，此时虽然使用的是通配符，但是不再是Object类型，而是对应的上界
        Score<? super Number> score2 = new Score<>("数据结构与算法基础", "EP074512", 10);
        Object o2 = score2.getValue();


    }
    static class A implements Test<String>{

        @Override
        public String test(){
            return null;
        }
    }
    /*
    接口、抽象类、继承都可以使用泛型
    public interface Study<T> {
    T test();
    }
    static class A<T> {
    }
    static class B extends A<String> {
    }
     */

    private static <T> T test(T t){   //在返回值类型前添加<>并填写泛型变量表示这个是一个泛型方法
        return t;
    }

    /*
    Supplier供给型函数式接口： 这个接口是专门用于供给使用的，其中只有一个get方法用于获取需要的对象。

    @FunctionalInterface   //函数式接口都会打上这样一个注解
    public interface Supplier<T> {
        T get();   //实现此方法，实现供给功能
    }

    Consumer消费型函数式接口： 这个接口专门用于消费某个对象的。
    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);    //这个方法就是用于消费的，没有返回值

        default Consumer<T> andThen(Consumer<? super T> after) {   //这个方法便于我们连续使用此消费接口
            Objects.requireNonNull(after);
            return (T t) -> { accept(t); after.accept(t); };
        }
    }

    Function函数型函数式接口： 这个接口消费一个对象，然后会向外供给一个对象（前两个的融合体）
    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);   //这里一共有两个类型参数，其中一个是接受的参数类型，还有一个是返回的结果类型

        default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
            Objects.requireNonNull(before);
            return (V v) -> apply(before.apply(v));
        }

        default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
            Objects.requireNonNull(after);
            return (T t) -> after.apply(apply(t));
        }

        static <T> Function<T, T> identity() {
            return t -> t;
        }

        Predicate断言型函数式接口： 接收一个参数，然后进行自定义判断并返回一个boolean结果。
    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);    //这个方法就是我们要实现的

        default Predicate<T> and(Predicate<? super T> other) {
            Objects.requireNonNull(other);
            return (t) -> test(t) && other.test(t);
        }

        default Predicate<T> negate() {
            return (t) -> !test(t);
        }

        default Predicate<T> or(Predicate<? super T> other) {
            Objects.requireNonNull(other);
            return (t) -> test(t) || other.test(t);
        }

        static <T> Predicate<T> isEqual(Object targetRef) {
            return (null == targetRef)
                    ? Objects::isNull
                    : object -> targetRef.equals(object);
        }
    }
     */

    private static void testnull1(String str){   //传入字符串，如果不是空串，那么就打印长度
        if(str == null) return;   //这样就可以防止null导致的异常了
        if(!str.isEmpty()) {
            System.out.println("字符串长度为："+str.length());
        }
    }

    //判空包装类Optional，这个类可以很有效的处理空指针问题
    private static void testnull2(String str){
        Optional
                .ofNullable(str)   //将传入的对象包装进Optional中
                .ifPresent(s -> System.out.println("字符串长度为："+s.length()));
        //如果不为空，则执行这里的Consumer实现
    }
}