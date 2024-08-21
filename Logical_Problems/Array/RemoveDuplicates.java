/*
 * Remove Duplicates from Sorted Array: Given a sorted array, remove the duplicates in
place such that each element appears only once and return the new length.
 */
package Logical_Problems.Array;
import java.util.*;
public class RemoveDuplicates {

    static int removeDupli(int []arr){
        //int length = 0;
        HashSet<Integer> hs = new HashSet<>();

        for(int x : arr){
            hs.add(x);
        }
        int ind =0;
        for(Integer ele : hs){
            arr[ind++] = ele;
        }

        //System.out.println(Arrays.toString(arr));
        System.out.println(hs);

        return hs.size();
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,4,5,6,6,7,8,8};
        int len = removeDupli(arr);
        System.out.println("length of array is : " + arr.length);
        System.out.println("Length of array after removal of duplicates: " + len);
    }
}
