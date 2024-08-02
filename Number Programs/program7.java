/*Prime number */

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int c = 0;
        if( n == 0 || n == 1){
            System.out.println(n + " is not prime");
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
            System.out.println(n + " is prime number");
        }else{
            System.out.println(n+" Not prime");
        }
        sc.close();
    }
}
