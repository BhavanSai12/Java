package AbstractionEx;
/*
create a class Emp having data-members employId,employName,cname.
use cal_sal() as abstract method.derive 2 sub-classes Part_Emp
and Full_Emp
calculate salaries of 2 employees.

 */
abstract class employee{
    int employId;
    String employName;
    String companyName;
    public employee(int employId,String employName,String companyName){
        super();
        this.companyName=companyName;
        this.employId=employId;
        this.employName=employName;
    }
    void displayEmployeeDetails(){
        System.out.println("Name: "+employName);
        System.out.println("Id: "+employId);
        System.out.println("Company: "+companyName);


    }
    abstract void calculateSalary();
}
class partTimeEmployee extends employee{

    public partTimeEmployee(int employId, String employName, String companyName) {
        super(employId, employName, companyName);
    }

    @Override
    void calculateSalary() {
        int hours=100;
        int aph=250;
        super.displayEmployeeDetails();
        System.out.println("Part Time Employee Salary : "+(hours*aph));
    }
}
class fullTimeEmployee extends employee{

    public fullTimeEmployee(int employId, String employName, String companyName) {
        super(employId, employName, companyName);
    }

    @Override
    void calculateSalary() {
        int days=28;
        int apd=500;
        super.displayEmployeeDetails();
        System.out.println("Full Time Employee Salary "+(days*apd));

    }
}
public class EmploySalary {
    public static void main(String[]args){
        fullTimeEmployee p1=new fullTimeEmployee(167,"Bhavan Sai","Onward Technologies");
        partTimeEmployee p2=new partTimeEmployee(166,"Stupid","Onward Technologies");
        p1.calculateSalary();
        p2.calculateSalary();
    }
}
