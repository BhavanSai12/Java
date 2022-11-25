public class RelationalOperator {
    public static void main(String[]args){
        //assignment operator
//        int a;
//        System.out.println(a=5);
//        System.out.println(a+=1);
//        System.out.println(a*=3);
//        //System.out.println(a/=1);
//        System.out.println(a&=2);

        //Logical Operator
//       int b=10,c=5,d=3;
//        System.out.println(b>c && b<c);
//
        //Bitwise Operator & Logical Operator
//        int a=10,b=5,c=3;
//        System.out.println(a<b && a++ >b);
//        System.out.println(a);
//        System.out.println(a<b & a++ >b);
//        System.out.println(a);

        //Bitwise Operator & Logical Operator || OR Operator

        int a=10,b=5,c=3;
        System.out.println(a>b || a++<b);
        System.out.println(a);
        System.out.println(a<b || a++ >b);
        System.out.println(a);
        System.out.println(a^c);
        System.out.println(~a);

    }
}
