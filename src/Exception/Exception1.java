package Exception;

public class Exception1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("hi");
        System.out.println("bye");
        try{
            System.out.println(200/0);

        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("hibye");
    }
}
