/*Computes the prime factorization of N using brute force. */
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int n = sc.nextInt();
         primeFactors(n);
         sc.close();
    }
    static void primeFactors(int n){
        System.out.println("Prime factors of " + n + " are : ");
       for(int i=2;i<=n;i++){
        if( n % i == 0 && isPrime(i)){
            
                System.out.print(i + " ");
             
        }
       }
    }
    static boolean isPrime(int num){
        
        if(num <= 1){
            return false;
        }

       for(int x=2;x<=Math.sqrt(num);x++){
        if( num % x == 0){
            return false;
        }
       }
       return true;

    }
}
