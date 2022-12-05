package exercism.org;

import java.util.Scanner;

public class Twofer {
    public static void  twofer(String name){
        //return "One for "+name+", one for me.";
        System.out.println("One for "+name+", one for me.");

    }
    public static void  deleteName(){
        //return "One for you , one for me.";
        System.out.println("One for you, one for me.");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        twofer(name);
        deleteName();
    }
}


/*----------------Another Way-----

import static java.util.Optional.ofNullable;
class Twofer {
    String twofer(String name) {
        return String.format("One for %s, one for me.", ofNullable(name).orElse("you"));
    }
}


 */