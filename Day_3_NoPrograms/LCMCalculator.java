/*Lowest Common Multiple (LCM) : */
import java.util.*;;
public class LCMCalculator {

    // Method to calculate the Greatest Common Divisor (GCD) using the Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
            
        }
        return a;
    }

    // Method to calculate the Least Common Multiple (LCM) using the GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbrs : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Calculate LCM
        int lcm = lcm(num1, num2);

        // Print the LCM
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    }
}
