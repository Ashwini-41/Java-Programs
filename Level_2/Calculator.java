/*
1. Java Program to create a calculator and Return a Value from a Method.
   Explanation :We make a method named input which is used to get input from the user. We also make a
    method named add which is used to perform addition and return the result back to the input method 
    where we finally print the result.
  
 */
package Level_2;
import java.util.*;

public class Calculator {
    Scanner sc = new Scanner(System.in);
   
    private int addition(int n1,int n2){
        return n1+n2;
    }

   private void input(){
      System.out.println("Enter num1: ");
      int n1 = sc.nextInt();
      System.out.println("Enter num2: ");
      int n2 = sc.nextInt();

      System.out.println("Addition is : " + addition(n1,n2));
   }
    public static void main(String[] args) {
       
     Calculator obj = new Calculator();
     obj.input();

    }
    
}
