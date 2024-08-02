
import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter number of col : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter elements of array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               arr[i][j] = sc.nextInt();
            }
            
        }
        printArray(row,col,arr);
       
        
        sc.close();
        
    }
    static void printArray(int row,int col,int[][] arr){
        System.out.println("2D array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
