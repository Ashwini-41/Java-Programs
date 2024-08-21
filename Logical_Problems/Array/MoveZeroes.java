/*
Move Zeroes: Given an array nums, write a function to move all 0's to the end of it while
maintaining the relative order of the non-zero elements
 */
package Logical_Problems.Array;

import java.util.Arrays;

public class MoveZeroes {

    private static void moveZero(int arr[]){
        int n = arr.length;
        int nonZero = 0;
        for(int i=0;i<arr.length;i++){
           if(arr[i] != 0){
            arr[nonZero] = arr[i];
            nonZero++;
           }
        }

        for(int j = nonZero ;j<n;j++){
            arr[j] = 0;
        }
   
    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,4,0,3,0};
        moveZero(arr);
        System.out.println("Array after moving zeroes : " + Arrays.toString(arr));
    }
}
