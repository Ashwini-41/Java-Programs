/*Merge Sorted Array: Given two sorted integer arrays nums1 and nums2, merge nums2
into nums1 as one sorted array. */

package Logical_Problems.Array;

import java.util.Arrays;

public class MergeSortedArray {

    private static void mergeArr(int arr1[], int arr2[]){
        int n = arr1.length + arr2.length;
        int merge[] = new int[n];
        int x = 0;
        for(int i=0;i<arr1.length;i++){
            merge[x] = arr1[i];
            x++;
        }
        for(int i=0;i<arr2.length;i++){
            merge[x] = arr2[i];
            x++;
        }
        Arrays.sort(merge);
        System.out.println("Merge array: " + Arrays.toString(merge));

       
    }
    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,10};
        int arr2[] = {1,3,5,7,9};

        mergeArr(arr1,arr2);
    }
}
