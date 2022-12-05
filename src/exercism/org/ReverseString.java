package exercism.org;

import java.util.Scanner;

public class ReverseString {
    public static  String reverseString(String Sentence){  // set cheyale output vacheyalaga return chesteya null vasthundi so deniki
        return new StringBuilder(Sentence).reverse().toString();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String Sentence = sc.next();
        reverseString(Sentence);
    }
}
