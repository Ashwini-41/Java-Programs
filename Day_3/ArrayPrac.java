package Day_3;

public class ArrayPrac {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,9,12,34};

        printArr(arr);
    }
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
