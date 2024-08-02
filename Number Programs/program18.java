
/*factors of number */
import java.util.*;
public class program18 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int n = sc.nextInt();
         factorsOfno(n);
         sc.close();
    }
 
    static void factorsOfno(int n){
        System.out.println("Factors of " + n + " are :");
        for(int i=1;i<=n;i++){
            if(n  % i == 0){
                System.out.print(i + " ");
            } 
        }
        
    }
    
}
