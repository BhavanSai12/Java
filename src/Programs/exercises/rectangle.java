package Programs.exercises;

import java.util.Scanner;

public class rectangle {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        double width= sc.nextDouble();
        double height= sc.nextDouble();
        System.out.println("Area is "+(width*height));
        System.out.println("Perimeter is "+2*(height+width));
    }
}
