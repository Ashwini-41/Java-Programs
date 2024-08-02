package ArrayHandling;

import java.util.*;


public class FindDuplicates {
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,10,40,20,50,60,30,70,40,98,1,2,3,1};
        System.out.println("Array : " + Arrays.toString(arr));

        List<Integer> duplicates = findElements(arr);
        System.out.println(duplicates);

    }

    private static List<Integer> findElements(int[] arr) {
        System.out.print("Duplicate elements in array are : ");
       List<Integer> ans = new ArrayList<>();
       //Set<Integer> hs = new HashSet<>();
       Set<Integer> hs = new TreeSet<>();


       for(int i=0;i<arr.length;i++){
        
        if(hs.contains(arr[i])){
            ans.add(arr[i]);
        }
      
        hs.add(arr[i]);
           
       }
       //System.out.println("set "+hs);

       return ans;

    }
    
}
