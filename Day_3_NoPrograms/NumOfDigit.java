
import java.util.*;

public class NumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        int count = countDigit(n);
        System.out.println("The count of digit is : " + count);
        sc.close();
    }

    static int countDigit(int n) {
        if (n == 0) {
            return 0;
        }
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }
}
