package Interface;
interface Inter1{

    //    if only 0 method is exist then it is called Marker Interface
    //    if only 1 method is exist then it is called Functional Interface

//    public static final int x=112;        Default h
//    public abstract void method1();       Default h

    int x=112;
    void method1();
}
interface Inter2{
    int x=115;
    void method3();
}
public class Test1 implements Inter1,Inter2{
    public static void main(String[] args) {
        System.out.println("Main Entry point");
        System.out.println(Inter1.x);
        int x=113;
        System.out.println(x);
    }
    public void method1(){
        System.out.println("This is my method");
    }
    public void method3() {
        System.out.println("This is my method");
    }
}
