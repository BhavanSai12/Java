import java.util.Scanner;

public class HalfString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String string=input.nextLine();
        int halfString=(string.length())/2;
        System.out.println(string.substring(0, halfString));

    }
}
