import java.util.Scanner;

public class ReverseDigit {
    public static void  main(String[]args){
        Scanner input=new Scanner(System.in);
        String string=input.nextLine();
        
        System.out.print(string.charAt(1));
        System.out.print(string.charAt(0));
    }
}
