package Logical_Problems.String;

public class ReverseStringWord {
    private static String reverseSentence(String s){
        String []arr = s.trim().split("\\s+");

       StringBuilder res = new StringBuilder();
        for(int i=arr.length-1 ; i > 0 ;i--){
            res.append(arr[i] + " ");
        }
        return res.toString();

        //arraoch 2
        //String  out = "";
        // for(int i=arr.length-1 ; i > 0 ;i--){
        //     out += arr[i] + " ";
        // }

        //return out + arr[0];
    }
    public static void main(String[] args) {
        
    
    String s = "I am trying to be happy";
    String ans = reverseSentence(s);
    System.out.println("Reverse : "+ ans);
    }
}
