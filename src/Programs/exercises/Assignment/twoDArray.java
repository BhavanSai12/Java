package Programs.exercises.Assignment;

import java.util.Scanner;

public class twoDArray {
    public static void main(String[]args){
       /* int [][]a=new int[2][2];
        a[0][0]=10;
        a[0][1]=20;
        a[1][0]=30;
        a[1][1]=40;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }*/

//        Another way
        /*int[][] a= {{1,2,3},{4,5,6}};
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();

        }
*/

//        One More Model
        /*Scanner s=new Scanner(System.in);
        System.out.println("enter the rows and cols of Matrix");
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] a=new int[r][c];
        System.out.println("enter "+r*c+" elements into matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();
            }
        }

        System.out.println("Matrix is");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }*/

//        Trace Of Matrix

        Scanner s=new Scanner(System.in);
        System.out.println("enter the Matrix Order nXn");
        int n=s.nextInt();
        int[][] a=new int[n][n];
        int sum=0;
        System.out.println("enter "+n*n+" elements into matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    sum=sum+a[i][j];
            }
        }
        System.out.println("Trace is "+sum);
    }

}
