// Creation of class
class Student{
    // Attributes == Properties == state == variable
    String name;
    long roll_no;
    String Branch = "CS";
    char Section = 'D';
    String city;
    int aMarks[] = new int[10];

    //Methods = functions in C == procedure
    void checkResult(){
        System.out.print("Hello");
    }

    public static void main(String[] args) {
        //creating a object
        Student st1= new Student();
        Student st2= new Student();
        Student st3= new Student();
        st1.name = "Sanyam";
        st2.name = "Ashish";
        st3.roll_no = 1234;
        System.out.print("1st student name is "+st1.name);

    }

}