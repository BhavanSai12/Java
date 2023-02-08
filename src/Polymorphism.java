public class Polymorphism {
//    Polymorphism:(poly +morphism)
//    poly means many and morphism means forms
//    finally polymorphism means many forms
//    Ability to represent one in many forms is called polymorphism.
//    An object is exhibit different behaviour in different situations
//    A method exhibit different behaviour in different situation
//
//    types of polymorphism:
//            1) compile time polymorphism or early binding polymorphism
//    the method behaviour is bounded at compile time.
//    Ex: Method Overloading
//
//
//2) run time polymorphism or lately binding polymorphism
//    the method behaviour is rebounds and depends on run time
//
//    Ex: a)Method Overriding  b)Inheritance c)Up casting
//Method Overloading:
//    A method which has same name but different signatures.
//    same method with different no of arguments
//    same method with different type of arguments
//    same method with different order of arguments
    public static class A{
        void greet(){  //method hiding
            System.out.println("Welcome");
        }
        public class B extends A{
            void greet(){
                System.out.println("Good Evening");
            }
        }
}
    public static class calculator{
        void findArea(){
            int breath=3;
            int height=5;
            System.out.println("Area of Triangle: "+(0.5*breath*height));
        }
        void findArea(int s){
            System.out.println("Area of Square: "+(s*s));
        }
        void findArea(float l,float b){
            System.out.println("Area of Rectangle: "+(l*b));
        }
        void findArea(double r){
            System.out.println("Area of Circle: "+(Math.PI*r*r));
        }
}
    public static void main(String[]args){
        calculator ob=new calculator();
        A c=new A();
        c.greet();
        ob.findArea();
        ob.findArea(3);
        ob.findArea(2.5);
        ob.findArea(1.2f,2.4f);
    }


}
