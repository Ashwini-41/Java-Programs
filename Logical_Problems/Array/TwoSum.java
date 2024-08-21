/*
 Two Sum: Given an array of integers, return indices of the two numbers such that they
add up to a specific target.
 */
package Logical_Problems.Array;
import java.util.*;
public class TwoSum {

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int arr[] = {2,6,4,10,1,3,11};
    int k = 15;
    
    ArrayList<Integer> res = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        
        for(int j=i+1;j<arr.length;j++){
            if(arr[i] + arr[j] == k){
               res.add(i);
               res.add(j);
            }
        }

    }
    if(res.isEmpty()){
        res.add(-1);
        res.add(-1);
    }
    System.out.println(res);
    sc.close();
}

}
