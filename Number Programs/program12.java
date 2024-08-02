/*Armstrong number : */
import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println(" Enter a number ");
    
      int n = sc.nextInt();
      int c = 0;
      int no = n;
      int temp = n;
      
      while (no != 0) {
        c++;
        no = no/10;
      }
      System.out.println("count " + c);
      int sum = 0;
     while (n!=0) {
        
        int prod = 1;
        for(int i=1;i<=c;i++){
             int rem = n % 10;
             prod = prod*rem;
           
         }
         sum = sum + prod;
         n = n/10;
     }
      
     //System.out.println(sum);
     if(sum == temp){
        System.out.println("Armstrong number");
     }else{
        System.out.println(" Not armstrong number");
     }
      
      
      sc.close();
   } 
}
