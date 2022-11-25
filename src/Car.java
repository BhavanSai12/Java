public class Car {//car specification
    static int wheels=4;
    String modelName="";
    String color="";
    static void Braking(){
        System.out.println("...Car Halts When Brakes applied..");
    }
    void mileage(int s){
        System.out.println("Mileage is " +s+ " KMPH");
    }
    public static void main(String[]args) {
        Car Benz = new Car();//Object Creation
        Car Audi = new Car();
        Car Kia = new Car();
/*
        Benz.modelName = "AMG";//model name initialization
        Audi.modelName = "A6";
        Kia.modelName = "Seltos";
        Benz.color = "BLACK";//color initialization
        Audi.color = "RED";
        Kia.color = "WHITE";
        System.out.println("BENZ " + Benz.modelName +' '+ Benz.color);
        System.out.println("AUDI " + Audi.modelName + ' '+Audi.color);
        System.out.println("KIA " + Kia.modelName + ' '+Kia.color);
*/
        Benz.Braking();
        Audi.Braking();

        Benz.mileage(20);
        Audi.mileage(15);
        Kia.mileage(18);

    }
}
