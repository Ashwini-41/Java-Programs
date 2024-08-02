package Day_3;

public class OddPositionEle {
    public static void main(String[] args) {
        int[] arr = {56,34,21,56,20,35,65,88,65,67};
        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array elements at odd position : ");
        for(int i=0;i<arr.length;i++){
            if(i%2 == 1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
