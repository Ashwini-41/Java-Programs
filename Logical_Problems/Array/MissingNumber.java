/*
 * Missing Number: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
find the one that is missing from the array.
 */
package Logical_Problems.Array;
public class MissingNumber {

    private static int missingNo(int arr[]){
        //int ans = 0;
        /* 
        boolean falg = false;
        for(int i=0;i<arr.length;i++){
            if(i != arr[i]){
                falg = true;
                return i; 
               // ans = i;
            }
        }
        if(!falg){
            return -1;
        }else{
            return arr.length;
        } */
       int n = arr.length;
       int expectedSum = (n * (n+1)) / 2;
       int actualSum = 0;
       for(int i=0;i<n;i++){
        actualSum += arr[i];
       }
       return expectedSum - actualSum;
        
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,6,7};
        int ans = missingNo(arr);
        System.out.println("Missing number: " + ans);
    }
}
