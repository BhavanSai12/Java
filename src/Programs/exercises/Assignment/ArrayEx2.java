package Programs.exercises.Assignment;

import java.util.Scanner;

/*
find the second max element from the Array without using Sorting.
 */
public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a= new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        int max1=a[0];
        int max2=a[1];
        if(max2>max1)
        {
            int temp=max1;
            max1=max2;
            max2=temp;
        }
        for(int i=2;i<a.length;i++)
        {
            if(a[i]>max1)
            {
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2)
                max2=a[i];
        }
        System.out.println(max2);
    }
}
