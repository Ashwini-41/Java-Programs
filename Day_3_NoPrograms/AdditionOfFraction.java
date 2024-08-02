import java.util.Scanner;

public class AdditionOfFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator of the first fraction: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the denominator of the first fraction: ");
        int den1 = scanner.nextInt();

        System.out.print("Enter the numerator of the second fraction: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the denominator of the second fraction: ");
        int den2 = scanner.nextInt();

        int resultNum = num1 * den2 + num2 * den1;
        int resultDen = den1 * den2;

        int gcd = findGCD(resultNum, resultDen);
        resultNum /= gcd;
        resultDen /= gcd;

        System.out.println("The result of the addition is: " + resultNum + "/" + resultDen);

        scanner.close();
    }

    // Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

