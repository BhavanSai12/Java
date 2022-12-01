/*
Method Overloading: Several methods in java are allowed to have same
 method name with different parameters and different definitions.
 This concept is used when there is necessity to perform similar
 tasks with different arguments.

 Different ways to overload the method
 1.By changing number of arguments
 2.By changing the data type

 */

public class MoverLoading {
    static int addition(int a,int b){
        return a+b;
    }
    static int addition(int a,int b,int c){
        return a+b+c;
    }
    static double addition(double a,double b,int c){
        return a+b+c;
    }

    public static void main(String[]args){
        System.out.println(addition(12,13));
        System.out.println(addition(12,13,14));

        System.out.println(addition(12.2,13.3,14));

    }
}
