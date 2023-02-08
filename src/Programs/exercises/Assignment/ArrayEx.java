package Programs.exercises.Assignment;

import java.util.Scanner;
//Bubble-sort
public class ArrayEx {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a= new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(" Ascending order\n");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
