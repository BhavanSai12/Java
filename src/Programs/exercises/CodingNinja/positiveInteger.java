package Programs.exercises.CodingNinja;

import java.util.Scanner;

public class positiveInteger {
    public static String checkNumber(int Number){
        if(Number>0)
            return "Positive";
        else if (Number<0)
            return  "Negative";
        else
            return "zero";
    }
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        int Number=sc.nextInt();
        System.out.println(Number+" is "+checkNumber(Number));
    }
}
