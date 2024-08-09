/* Java Program to Find Arithmetic Sum by Passing Argument Using Method Overloading */
   
package Level_2;
import java.util.*;

public class MethodOverloading {
    void addition(int a , int b){
         int add = a + b;
         System.out.println("Addition of two number is : " + add);
    }

    void addition(int a, int b,int c){
        int add = a + b + c;
        System.out.println("Addition of three number is : " + add);
    }

    void addition(float a , float b){
        float add = a + b;
        System.out.println("Addition of float  number is : " + add);
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        obj.addition(num2, num3);
        obj.addition(num1, num2, num3);
        obj.addition(17.5f, 20.5f);
        sc.close();

        
        
    }
}
