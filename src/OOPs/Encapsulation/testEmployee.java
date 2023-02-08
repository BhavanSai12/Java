package Encapsulation;
/*
Create a bean class employee having data-members id,name,and salary use constructors amd setter and assign the values
use toString and getter access the values.
 */
class employee{
   private int id;
   private String name;
   private double salary;
   public employee(){

   }
   public employee(int id,String name,double salary){
       super();
       this.id=id;
       this.name=name;
       this.salary=salary;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class testEmployee {
    public static void main(String[]args){
        employee e1=new employee(9594,"Bhavan",200000.0);
        employee e2=new employee();
        e2.setId(1857);
        e2.setName("krishna");
        e2.setSalary(300000.0);
        System.out.println("Fetching data using toString");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println("Fetching data using getters");
        System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
        System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getSalary());


    }
}
