
//even or odd number
import java.util.*;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int n = sc.nextInt();
        EvenOdd(n);
        
        sc.close();
    }
    static void EvenOdd(int n){
        
        if(n % 2 == 0 && n != 0 ){
            System.out.println("Number is even");
        }else if(n % 2 == 1){
            System.out.println("Number is odd");
        }else{
            System.out.println("Enter valid number");
        }

    }
}
