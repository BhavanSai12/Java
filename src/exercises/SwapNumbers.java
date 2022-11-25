package exercises;

public class SwapNumbers {
    public static void main(String[]args){
        int a,b,temp;
        a=15;
        b=27;
        System.out.println("Before Swaping : "+a+","+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swaping "+a+","+b);
    }
}
