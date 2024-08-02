/*Power of a number :
 */

import java.util.Scanner;

public class program17 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        System.out.println("Enter power");
        int pow = sc.nextInt();

        double ans = Math.pow(n,pow);
        System.out.println("Answer is " + ans);
        sc.close();
   }
}