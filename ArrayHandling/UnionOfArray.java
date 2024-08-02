package ArrayHandling;

import java.util.Arrays;
import java.util.*;

public class UnionOfArray {
    public static void main(String[] args) {
        int arr1[] = new int[]{10,20,30,40,50,60,70,3,45};
        int arr2[] = new int[]{80,90,50,65,10,30,55};
        System.out.println("First Array  : "+ Arrays.toString(arr1));
        System.out.println("Second Array : "+ Arrays.toString(arr2));
        

        Set<Integer> ans = unionEle(arr1,arr2);
        System.out.println("Union of two arrays : " + ans);
    }

    private static Set<Integer> unionEle(int[] arr1, int[] arr2) {
        Set<Integer> unique  = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            unique.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            unique.add(arr2[i]);
        }

        return unique;
    }
    
}
