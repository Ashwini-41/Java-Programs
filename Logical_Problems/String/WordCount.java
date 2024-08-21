/*Word Count: Write a function to count the number of words in a given string.
 */
package Logical_Problems.String;
import java.util.*;
public class WordCount {
    static int countOFWord(String str){
        //int count = 0;
         String arr[] = str.split(" ");
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        return arr.length;
    }
    public static void main(String[] args) {
       
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String : ");
            String str = sc.nextLine();

            int ans = countOFWord(str);
            System.out.println("Count is: " + ans);
            sc.close();
    }
}
