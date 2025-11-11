package module_1;

import java.util.Arrays;

public class Main {
    void main() {
        int[][] matrix = {
                {2, 4, -1, 0},      // <- 0
                {-10, 5, 11, -5},   // <- 1
                {18, -7, 6, -1},    // <- 2
        };

        System.out.println("Matrix");
        printMatrix(matrix);

        int[][] matrixTranspose = transpose(matrix);

        System.out.println();
        System.out.println("Matrix Transpose");
        printMatrix(matrixTranspose);
    }

    public static int[][] transpose(int[][] matrix) {
        int rowNumber = matrix.length; // number of rows
        int colNumber = matrix[0].length; // number of columns

        int[][] matrixTranspose = new int[colNumber][rowNumber];

        for (int rowIndex = 0; rowIndex < rowNumber; rowIndex++) {
            for (int colIndex = 0; colIndex < colNumber; colIndex++) {
                int matrixElement = matrix[rowIndex][colIndex];

                matrixTranspose[colIndex][rowIndex] = matrixElement;
            }
        }

        return matrixTranspose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            int[] row = matrix[rowIndex];
            System.out.println(Arrays.toString(row));
        }
    }
}
