package Logical_Programs;

import java.util.*;
public class PerfectNo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int n = sc.nextInt();
         if(isPerfectNo(n)){
            System.out.println(n + " is perfect number");
         }else{
            System.out.println(n + " is not perfect number ");
         }
         sc.close();
    }
    
 
    static boolean isPerfectNo(int n){
        int sum = 0;
        for(int i=1;i< n;i++){
            if(n  % i == 0){
                sum = sum + i;
            } 
        }
        if(sum == n){
            return true;
        }else{
            return false;
        }
        
        
    }
    
}


