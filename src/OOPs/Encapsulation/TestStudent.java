package Encapsulation;
class Student{
    private int rollNo;
    private String name;
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("Name of Student: "+name);
        System.out.println("Roll No of Student: "+rollNo);
    }
}
public class TestStudent {
    public static void main(String[]args){
        Student s=new Student();
        s.setName("Bhavan");
        s.setRollNo(12);
        s.display();
    }
}
