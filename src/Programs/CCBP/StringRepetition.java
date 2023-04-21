import java.util.Scanner;
public class StringRepetition {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        String number=input.next();
        int count=Integer.parseInt(number);
        System.out.println((str1+" ").repeat(count));
    }
}
