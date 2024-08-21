/*
 * String Compression: Write a function to perform basic string compression using the
counts of repeated characters. For example, the string "aabbbcccc" would become
"a2b3c4".
 */
package Logical_Problems.String;
import java.util.*;
public class StringCompression {

    private static String compressed(String str){
        //char arr[] = str.toCharArray();
        if(str == null || str.isEmpty() ){
            return str;
        }
       StringBuilder compressedS = new StringBuilder();
        int consecutive = 0;
        for(int i =0;i<str.length();i++){
              consecutive++;
              if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){

                compressedS.append(str.charAt(i));
                compressedS.append(consecutive);

                consecutive = 0;
              }
        }
        String compressedString = compressedS.toString();

        return compressedString.length() < str.length() ? compressedString : str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String ans = compressed(str);
        System.out.println("Compressed string is: " + ans);
        sc.close();
    }
}
