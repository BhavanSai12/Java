package CodingNinja;

import java.util.Scanner;

public class typeOf3angle {
        // Function to check if the triangle
        static void checkTriangle(int x, int y, int z) // is equilateral or isosceles or scalene
        {
            if (x == y && y == z ) // Check for equilateral triangle
                System.out.println("Equilateral Triangle");

            else if (x == y || y == z || z == x )   // Check for isosceles triangle
                System.out.println("Isosceles Triangle");


            else  // Otherwise scalene triangle
                System.out.println("Scalene Triangle");
        }


        public static void main(String[] args)
        {

            // Given sides of triangle
            //int x = 8, y = 7, z = 9;
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();

            // Function call
            checkTriangle(x, y, z);
        }
}
