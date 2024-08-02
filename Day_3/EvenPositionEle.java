package Day_3;

public class EvenPositionEle {
    public static void main(String[] args) {
        int[] arr = {56,34,21,56,20,35,65,88,65,67};

        System.out.println("Array elements at even position : ");
        for(int i=0;i<arr.length;i++){
            if(i%2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
