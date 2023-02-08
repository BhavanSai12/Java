package AbstractionEx;
/*
create a abstract class Bank use rateOfInterest() as abstract method.
        define different rate of Interests for Bank Implementation sub classes
        HdfcBank and ICICI Bank.        */

abstract class Bank{
    abstract void rateOfInterest();
}
class HdfcBank extends Bank{

    @Override
    void rateOfInterest() {
        System.out.println("The rate of Interest of HDFC :12.5% ");
    }
}
class ICICBank extends Bank{

    @Override
    void rateOfInterest() {
        System.out.println("The rate of Interest Of ICICI :10.5% ");
    }
}
public class Loan {
    public static void main(String []args){
        HdfcBank hb=new HdfcBank();
        ICICBank cb=new ICICBank();
        hb.rateOfInterest();
        cb.rateOfInterest();

    }
}