package Day_3;

public class MinElement {
    public static void main(String[] args) {
        
   
    int[] arr = {56,34,21,56,20,35,65,88,65,67};
    int ans = minEle(arr);
    System.out.println("Minimum element is "+ans);
   }
   static int minEle(int[] arr){
    int min = arr[0];
    for(int x:arr){
        if(x<min){
            min = x;
        }
    }
    return min;
   }
}
