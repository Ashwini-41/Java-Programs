import java.util.*;
public class StrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number : ");
        int n = sc.nextInt();
        if(isStrongNo(n)){
            System.out.println(n + " is Strong number");
        }else{
            System.out.println(n + " is not a Strong number");
        }
        sc.close();
    }
    static int factorial(int digit){
        int fac = 1;
        for(int i=1;i<=digit;i++){
            fac = fac*i;
        }
        //System.out.println("factorial of " + digit + " is " + fac);
        return fac;
    }
    static boolean isStrongNo(int n){
        //int fac = 1;
        int sum = 0;
        int temp = n;
        while (n!=0) {
            int digit = n % 10;
            sum = sum + factorial(digit);
            n = n/10;
        }
        if(temp == sum){
            return true;
        }else{
            return false;
        }
    }
}
