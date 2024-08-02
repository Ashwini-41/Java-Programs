package ArrayHandling;

public class SumAndAvg {
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,40,50,60};

        sumOfEle(arr);
    }

    private static void sumOfEle(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }

        double avg = sum / arr.length ;
        System.out.println("Sum of all element is : " + sum);
        System.out.println("Average is : " + avg);

    }
    
}
