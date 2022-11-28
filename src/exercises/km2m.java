package exercises;

import java.util.Scanner;

public class km2m {
    public static void findOut (float x){
        System.out.println("miles = "+(x*0.6213711922));
    }
    public static void main(String[]args){
        System.out.println("Enter the Kilometers");
        Scanner sc=new Scanner(System.in);
        float x= sc.nextInt();
        findOut(x);
    }
}
