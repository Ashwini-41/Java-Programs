package Logical_Problems.LogicBuilding_Program;

import java.util.Scanner;

public class BinaryToDecimal {
    private static int isDecimal(String binary){
        int decimal = 0;
        int length = binary.length();

        for(int i=0;i<length;i++){
            char digit = binary.charAt(length - 1 -i);

            if(digit == '1'){
                decimal += Math.pow(2, i);
            }
        }
        return decimal;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        String binary = sc.nextLine();

        int ans  = isDecimal(binary);
        System.out.println(ans + " decimal number");
        sc.close();
    }
}
