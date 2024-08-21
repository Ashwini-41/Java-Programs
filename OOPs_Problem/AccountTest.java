/*
 * Modify class Account to provide a method called debit that withdraws money
from an Account. Ensure that the debit amount does not exceed the Account’s
balance. If it does, the balance should be left unchanged and the method
should print a message indicating ―Debit amount exceeded account balance.
Modify class AccountTest to test method debit.
 */
package OOPs_Problem;
import java.util.*;

class Account {

    private double balance;



    Account(double balance){
       this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void debit(double amount){

        if(amount < balance){
            double newbalance = balance - amount;
            System.out.println("Account balance after " +  amount + " debited is " + newbalance);
            System.out.println("Withdrawal successful");
        }else{
            System.out.println("Debit amount exceeded account balance.");
        }

    }

    public void credit(double creditamount){
        double newbalance = balance + creditamount;
        System.out.println("Balance afer "+ creditamount +" credited is : " + newbalance );
    }
      
}

public class AccountTest{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
  
    System.out.println("Enter account balance :");
    double balance = sc.nextDouble();

    Account account = new Account(balance);
    System.out.println("Enter ammount of withdrawal : ");
    double amount = sc.nextDouble();
    account.debit(amount);

    System.out.print( "Enter credit amount: ");
    double creditamount = sc.nextDouble();
    account.credit(creditamount);

}
}
