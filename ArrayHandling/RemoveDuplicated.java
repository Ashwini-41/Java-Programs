package ArrayHandling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicated {
     public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,10,40,20,50,60,30,70,40,98,1,2,3,1};

        List<Integer> newArr  = removeElements(arr);
        for(int x: newArr){
            //System.out.print(newArr[x] + " ");
            System.out.print(x+" ");
        }
        System.out.println();
        

    }

    private static List<Integer> removeElements(int[] arr) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
                res.add(arr[i]);
                hs.add(arr[i]);
            }


        }
        return res;

        
    }
}
