/*
 * Anagram Check: Write a function to determine if two strings are anagrams of each other.
Anagrams are strings that contain the same characters but in a different order.
 */
package Logical_Problems.String;
import java.util.*;
public class Anagram {

    private void checkAnagram(String str1,String str2){
    
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
         
        //approach 1
        
        String s1 = new String(arr1);
        String s2 = new String(arr2);
        System.out.println(s1);
        System.out.println(s2);

        if(s1.equals(s2)){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }
        
    
        //approach 2
        /* 
        if(str1.length() != str2.length()){
            System.out.println("Not anagram");
        } else {
             int c = 0;
            for(int i=0;i<arr1.length;i++){
                
            if(arr1[i] == arr2[i]){
               c++;
            }
        }
        if (c == arr1.length){
            System.out.println("Anagram Strings");
        }else{
            System.out.println("Not anagrams");
        }
        }
        */

    }


    public static void main(String[] args) {
        
    
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter first String : ");
    String str1 = sc.nextLine();

    System.out.print("Enter second String : ");
    String str2 = sc.nextLine();

    Anagram obj = new Anagram();

    obj.checkAnagram(str1,str2);
    sc.close();

    }
}
