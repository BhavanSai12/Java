package AbstractionEx;

public class Abstraction {
    /*hiding the implementation details and showing only essential services.
    *
    * 2 ways of implemented
    * abstract class
    * interface
    *
    * abstract class :
    * contains may or may abstract methods but object creation is not possible and uses abstract keyword before the classname.
    * Syn:
            abstract class classname
            {
            abstract methods
            non-abstract methods
            }
*
abstract methods:
are uses abstract keyword and method declaration.
syn:
abstract void sum();
non-abstract methods:(defined methods)
methods without using abstract keyword and method definition
void sub()
{
//body of the method
}

Ex:
abstract class Calc
{
abstract void add();
void sub()
{
//logic
}
}
*
    concrete class:
    abstract methods of abstract class are defined by another class
    is called concrete class.
    concrete class has the responsibility to implement all the abstract
    methods of Abstract class, otherwise it will become abstract class. */
}
