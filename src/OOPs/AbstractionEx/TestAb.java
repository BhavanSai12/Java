package AbstractionEx;
abstract class A{
    abstract void greet();
    abstract void wish();
}
class B extends A{

    @Override
    void greet() {
        System.out.println("Hello Everyone");
    }

    @Override
    void wish() {
        
    }
}
class C extends B{
    void wish(){
        System.out.println("Welcome to Java");
    }
}
public class TestAb {
    public static void main(String[]args){
        B ob=new B();
        ob.greet();
        ob.wish();
       /* for abstract class object creation is not possible but
                but create reference variable which is pointing to its implemented class.
        A ob=new B();//upcasting*/
        A obj=new B();
        obj.greet();
        obj.wish();
        
        C object=new C();
        object.greet();
        object.wish();
        
        

    }
}


