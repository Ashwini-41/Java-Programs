/* Palindrome number  */

import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println(" Enter a number ");
    
      int n = sc.nextInt();
      int temp = n;
      int rev = 0;
      while( n != 0){
        // c++;
        int rem =  n % 10;
        rev = rev * 10 + rem;
         n = n/10;
      }
      if(temp == rev){
        System.out.println(temp + " is palindrome");
      }else{
        System.out.println(temp + " Not Palindrome Number ");
      }
      
      
      sc.close();
   } 
}
