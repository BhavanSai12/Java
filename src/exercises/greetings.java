package exercises;

import java.util.Scanner;

public class greetings {
    public static void greets(String name){
        System.out.println("Hello "+name+" have a good day");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        greets(name);
    }
}
