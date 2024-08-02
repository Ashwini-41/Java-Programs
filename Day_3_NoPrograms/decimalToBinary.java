import java.util.*;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number : ");
        int decimal = sc.nextInt();

        String binary = toBinary(decimal);
        System.out.println("Binary number of " + decimal + " is " + binary);
        sc.close();
    }
    static String toBinary(int decimal){
        StringBuilder binary = new StringBuilder();

        if(decimal == 0){
            return "0";
        }

        while (decimal > 0) {
            binary.append(decimal % 2);
            decimal = decimal /2;
        }
        return binary.reverse().toString();
    }
}
