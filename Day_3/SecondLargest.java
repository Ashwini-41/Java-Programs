package Day_3;

public class SecondLargest {
    public static void main(String[] args) {
        //int[] arr = {56,34,21,56,20,35,65,88,65,67};
        int[] arr = {12,21,23,4,5,6,7,65,43,3,20};

        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int ans = secMax(arr);
        System.out.println("Second Maximum element is : " + ans);
    }
    static int secMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                //secMax = max;
                max = arr[i];              
            }else if(secMax < arr[i] && secMax != max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
}
