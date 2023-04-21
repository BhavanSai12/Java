import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner inputfield= new Scanner(System.in);
        String Word=inputfield.nextLine();
        String string1="Hello ";
        System.out.println(string1.concat(Word));

    }
}