package exercises;

public class inheritanceExample {
    public static class Animal{
        //Actions describing here
        public void eat(){
            System.out.println("I can Eat");
        }
        public void jump(){
            System.out.println("I can Jump");
        }
        public void sleep(){
            System.out.println("I can Sleep");
        }
    }
    public static class Dog extends Animal{
        private String name;

        public void display(){
            System.out.println("My Name is "+ name);
        }
    }
    public static void main(String[] args){
        Dog shizu= new Dog();
        //details
        shizu.name="Scotch";
        shizu.display();
        shizu.eat();
        shizu.sleep();
        shizu.jump();
        
        

    }
}
