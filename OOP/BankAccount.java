/*Write a Java program to create a class called "BankAccount" with instance variables "balance" and 
"accountNumber." Include a method to deposit money into the account and a method to withdraw money 
from the account. */
package OOP;

public class BankAccount {
    float balance = 20000;
    int accountNumber = 2856;
    private void display(){
        System.out.println("Account number : " + accountNumber);
      System.out.println("Balance is : " + balance);
    }

    private float deposit(int depositAmount){
        balance = balance + depositAmount;
        return balance;
    }
    private float withdraw(int withdrawAmount){
        balance = balance - withdrawAmount;
        return balance;
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.display();
        int dep = 2000;
        System.out.println("Balance after deposit of " + dep + " is = "  + obj.deposit(dep));
        int withD = 5000;
        System.out.println("Balance after withdrawal of "+ withD + " is = "+obj.withdraw(withD));

    }
}
