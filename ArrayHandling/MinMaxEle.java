package ArrayHandling;
import java.util.Scanner;

public class MinMaxEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int[]  arr = new int[size];

        System.out.println("Enter elements in array : ");
        for(int i=0;i<size;i++){
             arr[i] = sc.nextInt();
        }
        minAmdMax(arr);

        
        sc.close();
    }
    static void  minAmdMax(int[] arr){

        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimun Element is " + min );
        System.out.println("Maximum element is " + max);
        
    }
    
}
