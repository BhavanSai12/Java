package OOPs.Inheritance;

public class TestInheritance3 {
    static class Animals{
        void eat(){
            System.out.println("I'm Eating.");
        }
        void sleep(){
            System.out.println("I'm Sleeping");
        }
    }
    static class Dog extends Animals{
        void bark(){
            System.out.println("Baow.Baow..Baow...");
        }

    }
    static class Cat extends Animals{
        void bark(){
            System.out.println("Meow. Meow.. Meow...");
        }
    }
    public static void main(String[] args){
        Cat c=new Cat();
        Dog d=new Dog();
        c.bark();
        c.eat();
        c.sleep();
        d.bark();
        d.eat();
        d.sleep();

    }
}
