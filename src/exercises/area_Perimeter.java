package exercises;

import java.util.Scanner;

public class area_Perimeter {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double radius= sc.nextDouble();
        double perimeter=2*Math.PI*radius;
        double area=Math.PI*radius*radius;

        System.out.println("Perimeter is = "+perimeter);
        System.out.println("Area is ="+area);
    }
}
