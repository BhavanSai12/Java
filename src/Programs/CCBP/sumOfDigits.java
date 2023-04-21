import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String string=input.nextLine();
        int firstIndex=string.charAt(0);
        int secondIndex=string.charAt(1);
        int thirdIndex=string.charAt(2);
        System.out.println(firstIndex+secondIndex+thirdIndex);
    }
}
