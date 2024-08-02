/*Fibonacci Series upto nth term :
  */

import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println(" Enter a number ");
    
      int n = sc.nextInt();
      int a = 0;
      int b = 1;
      for(int i=0;i<n;i++){
        if(i == 0 || i == 1){
            System.out.print(i+" ");
        }
        int c = a + b;
        System.out.print(c+" ");
        a = b;
        b = c;
      }
      sc.close();
    }
}
