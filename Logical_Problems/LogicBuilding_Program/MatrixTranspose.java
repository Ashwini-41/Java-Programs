package Logical_Problems.LogicBuilding_Program;

public class MatrixTranspose {

    static int[][] transposeMatrix(int[][] matrix,int row,int col){
        int[][] transpose = new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    static void displayMatrix(int[][] matrix , int row, int col){
        for(int i=0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int row = matrix.length;
        int col = matrix[0].length;

        System.out.println("Original Matrix: ");
        displayMatrix(matrix, row, col);

        int[][] transpose =  transposeMatrix(matrix,row,col);
        System.out.println("Transpose matrix");
        displayMatrix(transpose, row, col);
           
    }
}
