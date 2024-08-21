package Logical_Problems.String;
import java.util.*;

public class AllAnagramsInString {
    private static List<Integer> findAnagram(String s , String p){
      List<Integer> res = new ArrayList<>();

      if(s.length() < p.length() || s.length() == p.length()){
        return res;
      }
      HashMap<Character,Integer> pMap = new HashMap<>();
      HashMap<Character,Integer> sMap = new HashMap<>();

      for(char c : p.toCharArray()){
        pMap.put(c, pMap.getOrDefault(c, 0) + 1);
      }

      int windowSize = p.length();
      for(int i=0;i<windowSize;i++){
        char c = s.charAt(i);
        sMap.put(c, sMap.getOrDefault(c, 0) + 1);

      }

      for(int i=0; i <= s.length() - windowSize ;i++){
        if(sMap.equals(pMap)){
            res.add(i);
        }

        if(i + windowSize  < s.length()){
            char old = s.charAt(i);
            char newC = s.charAt(i+windowSize);

            sMap.put(old, sMap.get(old) - 1);

            if(sMap.get(old) == 0){
                sMap.remove(old);
            }

            sMap.put(newC, sMap.getOrDefault(newC, 0) + 1);

        }

      }
      return res;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter S String: ");
        // String s = sc.nextLine();
        // System.out.println("Enter P String: ");
        // String p = sc.nextLine();

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> res = findAnagram(s,p);
        System.out.println(res);
        sc.close();

    }
}
