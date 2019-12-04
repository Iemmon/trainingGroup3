package task1.flipMatrixTask;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Flip {

    public static void main(String[] args) {
        int[][] matrix = fillMatrix(4);
        displayMatrix(matrix);
        System.out.println("----------------");
        matrix = flip(matrix);
        displayMatrix(matrix);

    }

    public static int[][] flip(int[][] initArr) {
        int[][] newMatrix = new int[initArr.length][initArr.length];
        for (int i = 0; i < initArr.length; i++) {
            for (int j = 0; j < initArr.length; j++) {
                newMatrix[(initArr.length - 1) - j][i] = initArr[i][j];
            }
        }
        return newMatrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] >= 0) {
                    System.out.print(" " + matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static int[][] fillMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Random random = new Random();
                matrix[i][j] = random.nextInt(10) - 5;
            }
        }
        return matrix;
    }
}
