package task1.flipMatrixTask;

import java.util.Arrays;

public class MatrixView {

    public static final String INPUT_MATRIX_SIZE = "Enter matrix size: ";
    public static final String WRONG_INPUT = "Inappropriate value, try again: ";
    public static final String OUTPUT = "Result: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printResult(String message, int[][] initialMatrix, int[][] matrix) {
        System.out.println(message);
        for (int[] el : initialMatrix) {
            System.out.println(Arrays.toString(el));
        }
        System.out.println("--------------------");
        for (int[] el : matrix) {
            System.out.println(Arrays.toString(el));
        }
    }
}
