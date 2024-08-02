/* */
import java.util.Scanner;

public class program15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the term number
        System.out.print("Enter the term number (N) to find in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Find and print the Nth term using the iterative method
        int nthTerm = findFibonacciIterative(n);
        System.out.println("The " + n + "th term of the Fibonacci series is: " + nthTerm);

        scanner.close();
    }

    // Function to find the Nth term of the Fibonacci series using the iterative method
    public static int findFibonacciIterative(int n) {
        if (n <= 0) {
            return -1; // Invalid term number
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        int a = 0, b = 1, fib = 1;
        for (int i = 3; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
      
    }
}


