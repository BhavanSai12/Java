package exercises;

public class FamilySurname {
    public static class surname{
        String name;
        void part(){
            System.out.println("He/She is part of Family.");
        }

    }
    public static class person extends surname{
        void display(){
            System.out.println(name+" Ballimpalli");
        }
    }
    public static void main(String[]args){
        person p1=new person();
        p1.name="Bhavan Sai";
        p1.part();
        p1.display();

    }
}
