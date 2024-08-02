package ArrayHandling;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupliArr {
    public static void main(String[] args) {
            int arr[] = new int[]{10,20,30,10,40,20,50,60,30,70,40,98,1,2,3,1};
            System.out.println( "Array : " + Arrays.toString(arr));

            int uniqueArr[] = removeEle(arr);
            System.out.println( "Unique array  : " + Arrays.toString(uniqueArr));
    
    }

    private static int[] removeEle(int[] arr) {
        Set<Integer> hs = new HashSet<>();
        for(int ele : arr){
            hs.add(ele);
        }
        int uniqueArr[] = new int[hs.size()];
     
        int i = 0;
        for(int element : hs){
            uniqueArr[i] = element;
            i++;
        }
        return uniqueArr;

    }
    
}
