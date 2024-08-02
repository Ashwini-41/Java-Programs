/*Factorial number */

import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number :");
        int n = sc.nextInt();

        int fac = 1;
        if(n >0){
            for(int i=1;i<=n;i++){
                fac = fac * i;
            }
            System.out.println("The factorial of " + n + " is " + fac);
        }else{
            System.out.println("Invalid input");
        }
  sc.close();
   }
}
