import java.util.Scanner;//scan values util's

public class Functions {
    static int printAdd(int x, int y){
        System.out.println("The Sum is "+(x+y));
        return x+y;
    }
    static int printSub(int x,int y){
        System.out.println("The Sub is "+(x-y));
        return x-y;
    }
    static int printMulti(int x,int y){
        System.out.println("The Multiply is "+(x*y));
        return x*y;
    }
    static int printDiv(int x,int y){
        System.out.println("The DIV is "+(x/y));
        return x/y;
    }
    public static void main(String[] args){
        System.out.println("Enter The Two Values "); //declaring the value from outside write like this.
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        printAdd(x,y);// calling a function.
        printSub(x,y);
        printMulti(x,y);
        printDiv(x,y);
    }
}
