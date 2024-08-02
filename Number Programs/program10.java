/*reverse number */

import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println(" Enter a number ");
    
      int n = sc.nextInt();
      //int temp = n;
      int rev = 0;
      while( n != 0){
        // c++;
        int rem =  n % 10;
        rev = rev * 10 + rem;
         n = n/10;
      }
      
      System.out.println(" The reverse is " + rev);
      sc.close();
   } 
}

