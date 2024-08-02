import java.util.*;

public class ConvertNumToWord {
 
    private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
                                            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                                            "Eighteen", "Nineteen" };
    private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    private static final String hundred = "One Hundred";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0-100): ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Zero");
        } else if (number == 100) {
            System.out.println(hundred);
        } else {
            System.out.println(convert(number));
        }

        scanner.close();
    }

     static String convert(int number) {
        if(number > 100){
            return "Please enter number less than 100 ";
        }
        if (number < 20) {
            return units[number];
        } else {
            return tens[number / 10] + ((number % 10 != 0) ? " " + units[number % 10] : "");
        }
    }

}