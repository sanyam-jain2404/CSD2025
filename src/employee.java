class Employee{
    int nEmp;
    String sName;
    long nSal;
    String addr;
    void mCalcIncomeTax(long nSal){
        System.out.println("return income tax");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.nEmp = 1234;
        e1.sName = "Abhishek";
        e1.addr = "Ghaziabad";

        Employee e2 = new Employee();
        e2.nEmp = 1235;
        e2.sName = "Priyanshu";
        e2.addr = "Delhi";

        Employee e3 = new Employee();
        e3.nEmp = 3456;
        e3.sName = "Suraj";
        e3.addr = "Modinagar";

//        e1.mCalcIncomeTax(12345);
//        System.out.println("e1 employee id is "+e1.nEmp);
//        System.out.println("e1 employee name is "+e1.sName);
        if(e1.addr == "Delhi"){
            System.out.println(e1.sName);
        }
        else if(e2.addr == "Delhi"){
            System.out.println(e2.sName);
        }
        else{
            System.out.println(e3.sName);
        }
    }
}