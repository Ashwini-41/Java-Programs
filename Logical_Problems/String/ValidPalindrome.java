package Logical_Problems.String;

public class ValidPalindrome {
    private static boolean isPalindrome(String s){

        if(s.length() == 0 || s == null){
            return true;
        }
        int left = 0;
        int right = s.length() - 1 ;
        while (left < right) {

            while ( left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
            
        }
        return true;

        
    }
    public static void main(String[] args) {
    
    String s = "A man, a plan, a canal: Panama";
    //String s = "ab@a";
    System.out.println(isPalindrome(s));
    }
    
}
