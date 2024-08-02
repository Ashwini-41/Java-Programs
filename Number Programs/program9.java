/*Sum of digits of a number:
 */

import java.util.Scanner;

public class program9 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(" Enter a number ");
    
      int n = sc.nextInt();
      //int c = 0;
      int sum =0;
      while( n != 0){
        // c++;
        int rem =  n % 10;
        sum = sum + rem;
         n = n/10;
      }
      System.out.println(" Sum of digit of number is " + sum);
      sc.close();
   } 
}
