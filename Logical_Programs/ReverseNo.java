package Logical_Programs;

import java.util.Scanner;

public class ReverseNo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int ans = reversedNum(n);
        System.out.print("Reverse number is : " + ans);
        sc.close();
     }
     static int reversedNum(int n){

        int rev = 0;
        while (n!=0) {
            int rem = n % 10;
            rev = rev*10 + rem;
            n /= 10;
        }
        return rev;
     }
}
