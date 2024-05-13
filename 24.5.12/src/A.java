public interface A extends B{       //接口可以实现多继承，即A extends B,C,D...
    void one();

    void two();     //对B中的重写

    boolean equals(Object obj);     //Test中不需要再实现Object是因为这个和Object类中的equals相同

}
