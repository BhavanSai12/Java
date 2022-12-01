
/*
Constructor:A constructor is a special type of method that is used to initialize
instance variables in a class.
1.Its invoked when an instance of a class is created using the new operator.
2.Constructor can also accept arguments like methods and can be overloaded
 Syntax:
 Access modifier name class (parameter_list){
 //where we can initialize the values of instance variables,local variables,call the methods
 }
 */


public class College {
    int a;
    String b;
    College(int c,String d){
        a=c;
        b=d;
    }
    public static void main(String[]args){
        College c=new College(45, " Sun");
        College c1=new College(50, " Mon");
        System.out.println(c.a+c.b);
        System.out.println(c1.a+c1.b);
    }

}
