package exercises;

import java.util.Scanner;

public class StringMethods {
    public static void convertLower(String sentence){
        System.out.println(sentence.toLowerCase());
    }
    public static void convertUpper(String sentence){
        System.out.println(sentence.toUpperCase());
    }
    public static void convertLength(String sentence){
        System.out.println(sentence.length());
    }
    public static void replaceStr(String sentence){
        System.out.println(sentence.replace(sentence,"Stupid"));
    }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String sentence= sc.nextLine();
        convertLower(sentence);
        convertUpper(sentence);
        convertLength(sentence);
        replaceStr(sentence);
    }
}
