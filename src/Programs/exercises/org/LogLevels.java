package Programs.exercises.org;

import java.util.Scanner;

public class LogLevels {
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(' ')).trim();
    }
    public static String logLevel(String logLine) {
        return logLine.substring(1, logLine.indexOf(']')).toLowerCase();
    }
    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }



    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String logLine= sc.nextLine();
        message(logLine);
        logLevel(logLine);
        reformat(logLine);
    }
}
