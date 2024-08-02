package ArrayHandling;
import java.util.*;
public class IntersectionOfArray {
    public static void main(String[] args) {
        int arr1[] = new int[]{10,20,30,40,50,60,70};
        int arr2[] = new int[]{80,90,50,65,10,30,55};

        List<Integer> ans = intersectionEle(arr1,arr2);
        System.out.println("Intersection of two arrays : " + ans);
        

    }

    private static List<Integer> intersectionEle(int[] arr1, int[] arr2) {
       Set<Integer> hs = new HashSet<>();
       List<Integer> intersection = new ArrayList<>();
       
       for(int i=0;i<arr1.length;i++){
        hs.add(arr1[i]);
       }

       for(int i=0;i<arr2.length;i++){
        if(hs.contains(arr2[i])){
            intersection.add(arr2[i]);
        }
       }
       return intersection;
    }
}
