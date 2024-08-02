package Day_3;
import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        int[] arr = {56,34,21,56,20,35,65,88,65,67};

        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arraySort(arr);
        arraySort1(arr);
    }
    
    static void arraySort(int[] arr){
        Arrays.sort(arr);
        System.out.print("Sorted array :");
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static void arraySort1(int[] arr){
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array :");
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i] + " ");
        }
    }
}
