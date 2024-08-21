package Logical_Problems.LogicBuilding_Program;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int i = sc.nextInt();

        if(isArmstrong(i)){
        System.out.println("Armstrong numbers");
        }else{
            System.out.println("Not a armstrong number");
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
