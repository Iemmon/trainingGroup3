package task1.flipMatrixTask;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class FlipMatrixModel {

    private int[][] matrix;
    private int[][] initialMatrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public int[][] getInitialMatrix() {
        return initialMatrix;
    }

    public void flip() {
        int[][] newMatrix = new int[this.matrix.length][this.matrix.length];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                newMatrix[(this.matrix.length - 1) - j][i] = this.matrix[i][j];
            }
        }
        this.matrix = newMatrix;
    }

    public void fillMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Random random = new Random();
                matrix[i][j] = random.nextInt(10) - 5;
            }
        }
        this.initialMatrix = matrix;
        this.matrix = matrix;
    }
}
