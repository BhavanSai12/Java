package CodingNinja;

import java.util.Scanner;

public class avgMarks {
    static int avg(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char name=sc.next().charAt(0);
        int a= sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println(name);
        System.out.println(avg(a,b,c));
    }
}