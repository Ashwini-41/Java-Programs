package Day_3;

import java.util.HashSet;
import java.util.Set;

public class FrequencyOfEle {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,4,5,4,1,3,6,7,9};
        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Set<Integer> hs = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            int c = 0;
            if(!hs.contains(arr[i])){
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    c++;
                }
            }
            hs.add(arr[i]);
            System.out.println(arr[i] + " Count is " + c );
        }
            
        }
    }
}
