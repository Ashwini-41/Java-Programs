/*
Fibonacci Series
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).
 */
package Logical_Programs;
import java.util.*;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        series(n);
        System.out.println("Fibonacci series up to " + n);
        for(int i=0;i<n;i++){
            System.out.print(fiboSeries(i) + " ");
        }
        sc.close();

    }
    static void series(int n){
        System.out.println("Fibonacci series up to " + n);
        int a = 0;
        int b = 1;
        for(int i=1;i<=n;i++){

            System.out.print(a + " ");
            int c = a + b;
            //System.out.print(c + " ");
            a = b;
            b = c; 
        }
        System.out.println();

    }

    //recursion
    static int fiboSeries(int n){
        if(n <= 1){
            return n;
        }

        return fiboSeries(n-1) + fiboSeries( n-2);
    }
}
