import java.util.Scanner;

public class Indexing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String string=input.nextLine();
        int number=input.nextInt();
        System.out.print(string.charAt(number));
    }
}
