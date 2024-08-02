//Positive or nigative number
import java.util.*;
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int n = sc.nextInt();
        checkNo(n);
        
        sc.close();
    }
    static void checkNo(int n){
        if(n < 0){
            System.out.println("The number is nigative");
        }else{
            System.out.println("The number is positive");
        }

    }
      
      
}