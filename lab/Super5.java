package Oops.Super;
class Employee{
    String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary=salary;
    }
    void show(){
        System.out.println("Name: "+name + ", Salary: "+ salary);
    }
}
class Manager extends Employee{
    String dept;
    manager(String name, double salary,string dept){
        super(name, salary);
        this.dept=dept;
    }
    void show(){
        super.show();
    }
}
public class Super5 {
    public static void main(String[] args) {
        Manager m = new Manager(name);
    }
}