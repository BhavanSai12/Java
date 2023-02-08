package Interface;
/*
one class extends only with one but one interface can extends with multiple interfaces
one class can implements multiple interfaces
class extends  class
interface  extends interface
class  implements interface
class A extends B,C //in valid
class A implements B,C//valid
interface it1 extends it2
interface it1 extends it2,it3
class A extends B implements It1,it2

 */



interface I1{
    void wish();
}
interface I2{
    void greet();
}
class c implements I1,I2{

    @Override
    public void wish() {
        System.out.println("Hello");
    }

    @Override
    public void greet() {
        System.out.println("Welcome");
    }
}
public class example {
    public static void main(String[]args){
        c ob=new c();
        ob.wish();
        ob.greet();
    }
}
