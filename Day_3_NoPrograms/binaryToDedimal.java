import java.util.*;
public class binaryToDedimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        String binary = sc.nextLine();

        int ans  = isDecimal(binary);
        System.out.println(ans + " decimal number");
        sc.close();
    }
     static int isDecimal(String binary){
        int length = binary.length();
        int decimal = 0;

        for(int i=0;i<length;i++){
            char digit = binary.charAt(length - 1 -i);
            if(digit == '1'){
                decimal += Math.pow(2, i);
            }
        }
        return decimal;

        //return 0;
     }
}
