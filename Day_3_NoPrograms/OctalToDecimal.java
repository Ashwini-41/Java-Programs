import java.util.*;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Octal number : ");
        String binary = sc.nextLine();

        int ans = inDecimal(binary);
        System.out.println(ans + " decimal number");
        sc.close();
    }

    static int inDecimal(String octal) {
        int decimal = 0;
        int length = octal.length();
        for (int i = 0; i < length; i++) {
            char digit = octal.charAt(length - 1 - i);
            decimal += (digit - '0') * Math.pow(8, i);
        }
        return decimal;

    }
}
