public class Score<T> {  //泛型类需要使用<>，我们需要在里面添加1 - N个类型变量
    String name;
    String id;
    T value;        //T会根据使用时提供的类型自动变成对应类型
    //static U comments;    泛型不能在静态中使用
    //泛型在定义时只能定义为引用类型，不能定义为基本数据类型

    public Score(String name,String id,T value){    //这里T可以是任何类型，但是一旦确定，那么就不能修改了
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}
//public class Score<T extends Number> {   设定类型参数上界，必须是Number或是Number的子类
//在调用score的时候，<>中就不能写非Mumber子类的引用类型
