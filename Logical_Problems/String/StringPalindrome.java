/*Palindrome Check: Write a function to determine whether a given string is a palindrome.
A palindrome is a string that reads the same forwards and backwards. */
package Logical_Problems.String;
import java.util.*;
public class StringPalindrome {

    static boolean palindromeCheck(String str){
        //System.out.println("old " + str);

      StringBuilder rev = new StringBuilder(str);
      String reverseStr = rev.reverse().toString();
      System.out.println("new " +reverseStr);

      if(str.equals(reverseStr)){
        return true;
      }else{
        return false;
      }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        if (palindromeCheck(str) ){
            System.out.println("String is plaindrome");
        }else{
            System.out.println("String is not palindrome");
        }

        sc.close();
    }


}
