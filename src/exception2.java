import java.util.Scanner;

class MyException extends Exception{
    MyException(){
        super("Not allowed");
    }
    MyException(String msg){
        super(msg);
    }
}

class Test{
    public static void main(String[] args) throws MyException {
        Scanner SC =new Scanner(System.in);
        int a=SC.nextInt();
        if(a<18){
            throw new MyException();
        }
        else{
            System.out.println("Allowed");
        }
    }
}