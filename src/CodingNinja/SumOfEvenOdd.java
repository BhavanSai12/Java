package CodingNinja;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int temp=num;
        int sum1=0;
        int sum2=0;
        while(temp!=0)
        {
            int rem=temp%10;
            if(rem%2==0)
            {
                sum1=sum1+rem;

            }

            if(rem%2!=0)
            {
                sum2=sum2+rem;


            }
            // System.out.println(sum2);
            temp=temp/10;


        }
        System.out.println(sum1+" "+sum2);


    }
}
