import java.util.*;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number : ");
        int decimal = sc.nextInt();

        String ans = inHexaDecimal(decimal);
        System.out.println(" decimal number in hexadecimal form : " + ans);
        sc.close();
    }
    static String inHexaDecimal(int decimal){
        StringBuilder hexStr = new StringBuilder();
        if(decimal == 0){
            return "0";
        }
        
        while (decimal > 0) { 
            int rem = decimal % 16;
            char hexdigit;
            if(rem < 10){
                hexdigit = (char)('0' + rem);
            }else{
                hexdigit = (char)('A' + (rem - 10));
            }
            hexStr.insert(0 ,hexdigit);
            decimal = decimal/16;
        }
        return hexStr.toString();

    }
}
