
import java.util.*;
public class perfectSquare {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int n = sc.nextInt();
         if(isPerfectSqu(n)){
            System.out.println(n + " is perfect square");
         }else{
            System.out.println(n + " is not perfect square ");
         }
         sc.close();
    }

    static boolean isPerfectSqu(int n){
        if(n<=0){
            return false;
        }
        int res = (int)(Math.sqrt(n));

        if(res * res == n){
            return true;
        }else{
            return false;
        }

    }
}
    
