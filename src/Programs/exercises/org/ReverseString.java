package Programs.exercises.org;

import java.util.Scanner;

class main{
    public static void main(String[] args){
        //String str="hello";
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}