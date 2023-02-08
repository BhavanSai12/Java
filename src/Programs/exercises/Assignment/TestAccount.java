package Programs.exercises.Assignment;
/*
Create a class Account with the attributes accountNo – int, accountType –
String, accountBalance – int and methods setAccountDetails()
which set the values to these attributes, withdraw() which subtracts the
given amount from the available balance, deposit()
which adds given amount to the available balance and dispAccountDetails()
which displays accountNo, accountType, accountBalance.
Create a class TestAccount which contains the main() method to test the
functionality of the Account class
 */
class Account{
    int accountNo;
    String accountType;
    int accountBalance;

    void setAccountDetails(int accountNo,String accountType,int accountBalance){
        this. accountNo=accountNo;
        this. accountType=accountType;
        this. accountBalance=accountBalance;
    }

    void deposit(int amount) {
        accountBalance=accountBalance+amount;

    }
    void withdraw(int amount) {
        accountBalance=accountBalance-amount;

    }
    void dispAccountDetails(){
        System.out.println("Account Number: "+accountNo);
        System.out.println("Account Type: "+accountType);
        System.out.println("Balance: "+accountBalance);
    }

}
public class TestAccount {
    public static void main(String[]arg){
        Account user1=new Account();
        user1.setAccountDetails(131416745,"SalaryType",50000);
        user1.deposit(250000);
        user1.dispAccountDetails();
        user1.withdraw(65000);
        user1.dispAccountDetails();
        Account user2=new Account();
        user2.setAccountDetails(1314168765,"SavingType",20000);
        user2.deposit(20000);
        user2.withdraw(15000);
        user2.dispAccountDetails();
    }
}
