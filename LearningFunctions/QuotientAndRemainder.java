import java.util.*;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divident : ");
        int divident = sc.nextInt();
        System.out.println("Enter divisor : ");
        int divisor = sc.nextInt();

        int quotient = divident / divisor;
        int remainder = divident % divisor;
        System.out.println("Quotient is : "+quotient);
        System.out.println("Remainder is : "+remainder);

        sc.close();

    }
}
