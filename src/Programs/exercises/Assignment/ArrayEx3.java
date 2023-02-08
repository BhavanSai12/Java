package Programs.exercises.Assignment;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the decimal number");
        int n=s.nextInt();
        int[] a=new int[32];
        int i=0;
        while(n!=0)
        {
            a[i]=n%2;
            i++;
            n=n/2;
        }
        for(i=i-1;i>=0;i--)
            System.out.print(a[i]);



    }
}
