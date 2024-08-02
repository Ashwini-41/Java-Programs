import java.util.*;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number : ");
        String binary = sc.nextLine();

        int ans = inDecimal(binary);
        System.out.println(" Hexadecimal number in decimal form is : " + ans);
        sc.close();
    }

    static int inDecimal(String hexString) {
        int decimal = 0;
        int length = hexString.length();
        for (int i = 0; i < length; i++) {

            char digit = hexString.charAt(length - 1 - i);

            if (digit >= '0' && digit <= '9') {
                decimal += (digit - '0') * Math.pow(16, i);
            } else if (digit >= 'A' && digit <= 'F') {
                decimal += (digit - 'A' + 10) * Math.pow(16, i);
            } else if (digit >= 'a' && digit <= 'f') {
                decimal += (digit - 'a' + 10) * Math.pow(16, i);
            }
        }
        return decimal;

    }
}

