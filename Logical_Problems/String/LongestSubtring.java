/*
 * Longest Substring Without Repeating Characters: Given a string, find the length of the
longest substring without repeating characters.
 */
package Logical_Problems.String;
import java.util.*;
public class LongestSubtring {

    static int longestsubString(String str){
        HashSet<Character> set = new HashSet<>();

        int maxLength =0;
        int left = 0;

        for(int i=0;i<str.length();i++){

            while (set.contains(str.charAt(i))) {
                set.remove(str.charAt(left));
                left++;
                
            }

            set.add(str.charAt(i));
             //System.out.println(set);
            maxLength = Math.max(maxLength, i - left + 1);
        }
        
        return maxLength;
    }
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = sc.nextLine();
  
    int ans = longestsubString(str);
    System.out.println("The longest non repeating length substring is : " + ans);
    sc.close();


    }
    

   

}
