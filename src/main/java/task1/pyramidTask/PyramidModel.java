package task1.pyramidTask;

import java.util.Scanner;

public class PyramidModel {

    private char[][] pyramid;

    public char[][] getPyramid() {
        return pyramid;
    }

    public void buildPyramid(int height) {
        int width = 2 * height - 1;
        char[][] pyramid = new char[height][width];
        int middle = width / 2;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                pyramid[i][middle - j] = (char) ((i + 1) - j + 48);
                pyramid[i][middle + j] = (char) ((i + 1) - j + 48);
            }
        }
        this.pyramid = pyramid;
    }

    private static void fillPyramidWithEmptySpace(char[][] pyramid) {
        for (char[] row : pyramid) {
            for (char element : row) {
                element = ' ';
            }
        }
    }
}
