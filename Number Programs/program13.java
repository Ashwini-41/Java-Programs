/* Armstrong number in a given range :
*/
import java.util.*;
public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start :");
        int s = sc.nextInt();
        System.out.println("Enter end :");
        int e = sc.nextInt();

        System.out.println("Armstrong numbers : ");
        for(int i=s;i<=e;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
    static boolean isArmstrong(int n){
        int temp = n;
        int n1 = n;
        int c = 0;
        while (n1!=0) {
            c++;
            n1 = n1/10;
        }
        double sum = 0;
        while (n!=0) {
            int digit = n% 10;
            double pow = Math.pow(digit,c);
            sum = sum + pow;
            n = n/10;
        }
        if(sum == temp){
            return true;
        }else{
            return false;
        }
    
    }
}

