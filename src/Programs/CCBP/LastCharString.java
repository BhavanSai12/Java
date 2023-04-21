import java.util.Scanner;

public class LastCharString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String string=input.nextLine();
        int length=string.length();
        System.out.println(string.charAt(length-1));
    }
}
