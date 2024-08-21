package Logical_Problems.String;

import java.util.Scanner;

public class StringReverse {
    static void reverse(String str){
        StringBuilder rev = new StringBuilder(str);
        String ans = rev.reverse().toString();

        System.out.println("Reverse String : " + ans);
    }
    static void reverseS(String str){
        String s = "";
        for(int i=str.length() - 1;i>=0;i--){
            char c = str.charAt(i);
            s = s + c;
        }
        System.out.println("Reverse String : " + s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        reverse(str);
        reverseS(str);
        sc.close();
    }
}
