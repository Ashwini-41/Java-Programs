import java.util.Scanner;

public class DigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        System.out.print("Enter the digit to count: ");
        char digit = sc.next().charAt(0);

        int occur = countDigitoccur(number, digit);

        System.out.println("The digit " + digit + " occurs " + occur + " times in the number " + number);

     sc.close();
    }

    private static int countDigitoccur(String number, char digit) {
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                count++;
            }
        }
        return count;
    }
}

