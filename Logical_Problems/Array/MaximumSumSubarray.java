package Logical_Problems.Array;

public class MaximumSumSubarray {

    private static int maximimSum(int arr[]){
        int maxCurrent = arr[0];
        int maxGlobal = arr[0];

        for(int i=1;i<arr.length;i++){
        
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);

            if(maxCurrent > maxGlobal){
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }
   public static void main(String[] args) {
    int[] nums = {5, 4, -1, 7, 8};
    System.out.println("Maximum sum is : "+ maximimSum(nums));
   } 
}
