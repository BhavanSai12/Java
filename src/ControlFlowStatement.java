public class ControlFlowStatement {
    public static void main(String[]args){
        //Conditional Statement
        int a=25;
//        if(a>0)
//        {
//            System.out.println("Its a positive number");
//        }else {
//            System.out .println("Its a negative number");
//        }

        //Nested If Condition
//            if(a>0){
//                System.out.println("Its a Positive no:");
//            }else if(a==0){
//                System.out.println("Its a Neutral no:");
//            }else{
//                System.out.println("Its a Negative no:");
//            }

        //Switch case
//        int b=5;
//        switch (b){
//            case 1:
//                System.out.println("Ur in case 1");
//                break;
//
//            case 2:
//                System.out.println("Ur in Case 2");
//                break;
//            case 3:
//                System.out.println("Ur in Case 3");
//                break;
//            case 4:
//                System.out.println("Ur in Case 4");
//                break;                                //break will work as exit from condition is satisfied.
//            default:
//                System.out.println("No such case is available");
//        }


        //Loop Statements
       // execute the block of code repeatedly till the condition gets satisfied(true)
        /*
        WHILE LOOP:we don't know the number of iterations in advance , also known as the entry-controlled loop.
        Syntax:while(condition){
        //loop statements}
         */

//        int i=4;
//        while (i<=5){
//            System.out.println("The number is " +i);
//            i++;//i=1 increment
//        }


        /*
        For Loop :Use the for loop only when we exactly know the number of times, we want to execute the block of code.

        Syntax:
        for(initialization,condition,increment/decrement){
        *block of statements
        }
         */

//    int sum=0;
//    for(int i=1;i<=6;i++){
//        //1+2+3+4+5=15
//        sum+=i;
//    }
//    System.out.println("The Sum of first natural numbers is " +sum);





        /*do while: when the number of iteration is not known and we have to execute the loop at least once.
        its also known as the exit -controlled loop.

        Syntax : do{
        //Statements
        }while(condition);
         */

            //exit Control Loop called as

//        int i=6;
//        do{
//            System.out.println("the number is "+i);
//            i++;
//        }while(i<=5);



        /*Je
        Jump Statements
        -transfer the control of the program to the specific statements.

        Break Statement:break the current flow of the program and transfer the control to the next statement outside a loop or switch statement.

        Continue Statement: doesn't break the loop ,whereas,it skips the specific part of the loop and jumps to the next iteration of the loop.
         */
        for(int i=0;i<=10;i++) {
            if (i == 5) {
                // break;
                continue;//skips the specific path of loop(i==5)
            }
            System.out.println(i);
        }
        System.out.println("END");





    }

}
