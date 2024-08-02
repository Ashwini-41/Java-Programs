package Logical_Programs;
import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n + " is prime number");
        }else{ 
            System.out.println(n + " is not a prime number");
        }
        sc.close();
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    

}
