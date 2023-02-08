package Assignment;

import java.math.RoundingMode;

import static java.lang.Math.round;

/*
Write a program to create a class Rectangle with data members length and
breadth. Create a method area() which finds the area of the rectangle.
Use constructors to assign values to data members
 */
public class Rectangle {
    double length;
    double breadth;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;

    }
    public double area(){
        return round(length * breadth);
    }
    public static void main(String[]args){
        Rectangle r=new Rectangle(3.45,6.78);
        System.out.println(r.area());
    }

}
