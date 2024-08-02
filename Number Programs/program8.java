/*Prime number within a given range: */

import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter range to find prime number ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(" Prime numbers : ");
        for(int i = start; i <= end;i++){

            if(isPrime(i)){
                System.out.print(i + " ");
            }
            // else{
            //     System.out.println(i+ " is not a prime");
            // }
            
        }

        System.out.println();
        sc.close();
    }
    static boolean isPrime(int n){
        int c = 0;
        if( n == 0 || n == 1){
            return true;
        }
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                c++;
            }
            if( c > 2){
                break;
            }
        }
        if(c == 2){
            return true;
        }else{
            return false;
        }
        
    }
}
