package Programs.exercises;

public class Maths {
    static int maxNum(int x, int y){                ///Greatest Number///
        if(x>y){
            System.out.println("Greatest Number is : "+x);
            return x;
        }else{
            System.out.println("Smallest Number is : "+y);
            return y;
        }
    }
    public static void main(String[]args){
        int x=6;
        int y=3;
        maxNum(x,y);
    }
}
