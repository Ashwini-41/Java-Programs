package Day_3;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEle {
    public static void main(String[] args) {
        int[] arr = {12,3,21,23,12,3,45,2,4,2,56};
        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Duplicate Elements in array are : ");
        Set<Integer> printed = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int c =0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    c++;
                }
            }
            if(c > 1 && !printed.contains(arr[i])){
                System.out.print(arr[i] +" " );
                printed.add(arr[i]);
            }
        }
    }
}
