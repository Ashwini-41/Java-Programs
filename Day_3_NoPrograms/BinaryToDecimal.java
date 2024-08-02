import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Convert binary to decimal
        int decimal = binaryToDecimal(binaryString);

        // Print the decimal number
        System.out.println("The decimal equivalent of binary number " + binaryString + " is: " + decimal);

        scanner.close();
    }

    // Method to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            // Get the digit at the i-th position from the end
            char digit = binary.charAt(length - 1 - i);

            // Convert the character to integer (0 or 1) and calculate its value in decimal
            if (digit == '1') {
                decimal += Math.pow(2, i);
            }
        }

        return decimal;
    }
}

