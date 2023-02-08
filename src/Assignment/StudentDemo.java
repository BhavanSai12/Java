package Assignment;
/*
Write a program which creates a class “Student” with the following
Data Members
rollNum, studName, mark1, mark2, mark3, totalMarks
Methods
setStudDetails() – which sets the values to all the data members except
totalMarks.
calculateTotal() - which calculate the totalMarks
displayStudDetails() – which displays rollNum, studName and totalMarks
Create a class StudentDemo to test the functionality of Student class.
 */
class student{
    int rollNum;
    String studentName;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;
    void setStudDetails(int r,String s,int m1,int m2,int m3){
        rollNum=r;
        studentName=s;
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }

    void calculateTotal(){
        totalMarks=mark1+mark2+mark3;
    }
    void displayStudentDetails(){
        System.out.println("Name: "+studentName);
        System.out.println("Roll No: "+rollNum);
        System.out.println("Total Marks: "+totalMarks);
    }
}
public class StudentDemo {
    public static void main(String[]arg){
        student n=new student();
        n.setStudDetails(100,"venu", 98, 78, 87);
        n.calculateTotal();
        n.displayStudentDetails();
        student s2=new student();
        s2.setStudDetails(108,"sairam", 78, 85, 95);
        s2.calculateTotal();
        s2.displayStudentDetails();
    }
}
