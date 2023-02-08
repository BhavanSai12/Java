package Encapsulation;

public class Def {
    /*
    Encapsulation:
                    wrapping up of data members and methods into a Single Unit is called class.
                    applying access modifiers to data members and methods are also called encapsulation.
                    Hiding the data details
    Advantage:  Security
     */
/*
setters and getters :

setters: setting the value into a data-member using public access modifier
save the value.
getters: access the data member value and using public access modifier
fetch the value.

when a class has all private data members use public setters and public
getters for assign and access data members anywhere in the Application.

finally A class with private members and public setters and getters are
called bean class.
Bean is a Reusable Software Component.
 */
    //example
    static class student{
        private int rollno=100;
        private  String name="Bhavan";
        public void display(){
            System.out.println("Name of Student: "+name);
            System.out.println("Roll No of  Student : "+rollno);
        }

    }

    public static void main(String[]args){
      student ab=new student();
      ab.display();
    }
}
