/*5. Rotate Array: Rotate an array to the right by k steps, where k is non-negative.
 */
package Logical_Problems.Array;

import java.util.Arrays;

public class RotateArray {
    static int[] rotateArr(int arr[],int k){
        int n = arr.length;
       int res[] = new int[arr.length];

       k = k % n;
       for(int i =0;i<arr.length;i++){
       
       res[(i +k ) % n] = arr[i];
       }
       return res;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        int res[] = rotateArr(arr,k);
        System.out.println("Array after rotation : " + Arrays.toString(res));
    }
}
