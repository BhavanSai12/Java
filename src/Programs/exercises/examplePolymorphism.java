package Programs.exercises;

public class examplePolymorphism {
    public static class Animal{
        void eat(){
            System.out.println("Animals Eat");
        }
    }
    public static class herbivores extends Animal{
        void eat(){
            System.out.println("Herbivore eat Plants.");
        }
    }
    public static class omnivores extends Animal{
        void eat(){
            System.out.println("Omnivores eat Plants and Meat.");
        }
    }
    public static class carnivores extends Animal{
        void eat(){
            System.out.println("Carnivores eat Meat");
        }
    }
    public static void main(String[]args){
        Animal A=new Animal();
        Animal h=new herbivores();
        Animal o=new omnivores();
        Animal c=new carnivores();
        A.eat();
        h.eat();
        o.eat();
        c.eat();
    }
}
