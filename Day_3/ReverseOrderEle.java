/* Java Program to print the elements of an array in reverse order */
package Day_3;

public class ReverseOrderEle {
    public static void main(String[] args) {
        int[] arr = {56,34,21,56,20,35,65,88,65,67};

        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Reverse array : ");
        int start= 0;
        int end = arr.length - 1;

        while (start< end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
