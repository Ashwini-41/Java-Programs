//Sum of First N Natural numbers:
import java.util.*;
public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        int N = 10;
        for(int i=1;i<N;i++){
            sum = sum +i;
        }
        System.out.println("Sum of first N natural number is : " + sum);
        //take range
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum1 = 0;
       
        for(int i=1;i<n;i++){
            sum1 = sum1 +i;
        } 
        System.out.println("Sum of " + n + " natural number up to given range is " + sum1);


        sc.close();
    }
}
