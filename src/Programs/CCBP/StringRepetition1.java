import java.util.Scanner;

public  class StringRepetition1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String string=input.nextLine();
        int count=input.nextInt();
        String last = string.substring(string.length()-3);
        System.out.println(last.repeat(count));
    }
}
