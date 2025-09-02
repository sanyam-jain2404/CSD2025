import java.util.Scanner;

public  class largestof3  {
    public static void main(String[] args) {
        System.out.println("Enter three Numbers");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c=sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("Largest of 3 : " + a);
        } else if (b>=c) {
            System.out.println("Largest of 3 : " + b);
        }
        else {
            System.out.println("Largest of 3 : " + c);
        }
    }
}