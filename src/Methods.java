/*Methods:Uniqueness of parameter based on number of parameters and order of parameters
example: int print(int x,String y),int print(String y,int x)
why to use methods:
Code Re-usability,readable and easier  */

public class Methods {
    //By using Method implement table single argument
    static int multiple(int a){
        System.out.println("5 x "+a+" = "+5*a);
        return 5*a;
    }
    public static void main(String[]args){
        for(int i=1;i<=20;i++){
            multiple(i);
        }
    }
}


/*
----Types of Methods---
1.Instance Method(Non-Static): Used to implement behaviors of each instance of class
Syntax:void print()
{
//method body
}

2.Static Method(class Method)--Implements the behavior of the class
Syntax:static void print()
{
//method body
}




Call by value                                                                call by reference
--------------------------------------------------------------------------------------------------------------------
means that arguments value is copied                           Instead of copying the values of variables,the
and is passed to the parameter list                            address of the variables is used
of a method.
--------------------------------------------------------------------------------------------------------------------
changes made in a copy of variable never                       Change in the variable also affects the value of to
modify the value of variable outside the                        variable outside the function.
function.



Method Overloading:
two or more methods can have same name but different parameters such methods are called Overloaded Methods.
void foo()
void foo(int a)               => Overloaded Function foo
int foo(int a,int b)



Recursion:A function in java can call itself such calling of function by itself is called recursion.

Example: Factorial of a number
factorial(n)=n*factorial(n-1)
 */