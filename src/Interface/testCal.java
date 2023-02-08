package Interface;
/*
create an interface Calc having calculate(int a) abstract method.
using 2 subclasses SubCalc1 and SubCalc2 find the squareRoot and square.
 */
interface calculator{
    void calculate(int a);
    }
class subCalculator implements calculator{
    @Override
    public void calculate(int a) {
        System.out.println("Square Root: "+Math.sqrt(a));
    }
}
class subCalculator2 implements calculator{

    @Override
    public void calculate(int a) {
        System.out.println("Square is : "+(a*a));
    }
}
public class testCal {
    public static void main(String[]args){
        calculator ob=new subCalculator();
        calculator ob2=new subCalculator2();
        ob.calculate(5);
        ob2.calculate(5);
    }
}
