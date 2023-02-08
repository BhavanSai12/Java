package Programs.exercises;

import java.util.Scanner;

public class evenOdd {
    public static void even(int x){
        if(x%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        even(x);


    }
}
