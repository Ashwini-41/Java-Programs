/*
 * Product of Array Except Self: Given an array arr of n integers where n > 1, return an
array output such that output[i] is equal to the product of all the elements of arr except
arr[i].
 */
package Logical_Problems.Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    private static int[] productArray(int arr[]){
        int res[] = new int[arr.length];
    
        //app 2
    //     res[0] = 1;
    //     for(int i=1;i<res.length;i++){
    //       res[i] = arr[i-1] * res[i-1];
    //     }
    //    int R = 1;
    //     for(int i=arr.length - 1;i>=0;i--){
    //         res[i] = res[i] * R;
    //         R = R * arr[i];
    //     }
    
    int i=0;
    while (i<arr.length) {
        int p = 1;
        for(int j=0;j<arr.length;j++){
            if(j != i){
                p = p * arr[j];
            }
        }
        res[i] = p;
        i++;  
    }

    
        
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        //int arr[] = {1,-1,0,3,-3};

        int res1[] = productArray(arr);
        System.out.println(Arrays.toString(res1));
    }
}
