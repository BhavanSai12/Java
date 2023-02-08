package Assignment;
/*
Create an abstract class “Fruit” which contains an abstract method cost().
Create subclasses “Apple and Mango” which extends Fruit class. Use
appropriate data members in the respective classes. Create a class FruitDemo to
test the above functionalities.
 */

/*
abstract class Fruit{
    int weight=5;
    abstract void cost();
}
class Apple extends Fruit{

    @Override
    void cost() {
        System.out.println("Cost of "+weight+"Kgs Of Apples : Rs.300");
    }
}
class Mango extends Fruit{

    @Override
    void cost() {
        System.out.println("Cost of "+weight+"Kgs of Mangoes : Rs.500");
    }
}
public class FruitDemo {
    public static void main(String[]args){
        Apple A=new Apple();
        A.cost();
        Mango M=new Mango();
        M.cost();

    }
}

*/
//Modify the above program using interfaces

interface Fruit{
    int weight=5;
    void cost();
}
class Apple implements Fruit{

    @Override
    public void cost() {
        System.out.println("Cost of "+weight+"Kgs Of Apples Rs.300");
    }
}
class Mango implements Fruit{

    @Override
    public void cost() {
        System.out.println("Cost of "+weight+"Kgs Of Mangoes Rs.500");
    }
}
public class FruitDemo {
    public static void main(String[]args){
        Apple A=new Apple();
        A.cost();
        Mango M=new Mango();
        M.cost();
    }
}