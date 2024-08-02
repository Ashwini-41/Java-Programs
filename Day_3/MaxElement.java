package Day_3;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int[]  arr = new int[size];

        System.out.println("Enter elements in array : ");
        for(int i=0;i<size;i++){
             arr[i] = sc.nextInt();
        }
        int ans = largeEle(arr);
        System.out.println("Maximum element is " + ans);
        sc.close();
    }
    static int largeEle(int[] arr){

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
    
}
