package Logical_Problems.String;
import java.util.*;
public class StringToInteger{

    private static int myAtoi(String s){

        if(s.length() == 0 || s == null){
            return 0;
        }

        s = s.trim();
        if(s.length() == 0){
            return 0;
        }

        int index =0;
        int sign = 1;

        if(s.charAt(index) == '-' || s.charAt(index) == '+'){
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }

        int result = 0;
        while (index < s.length()) {
            char c = s.charAt(index);

            if(c < '0' || c > '9'){
                break;
            }
            int digit = c - '0';
            if(result > (Integer.MAX_VALUE - digit) /10){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
            
        }
        return sign * result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        String s = sc.nextLine();
       // String s = "-91283472332";

        System.out.println("Integer : " + myAtoi(s));
        sc.close();
    }
    
}
