package task1.pyramidTask;

import java.util.Arrays;

public class PyramidView {
    public static final String INPUT_PYRAMID_HEIGHT = "Enter pyramid height:";
    public static final String WRONG_INPUT = "Inappropriate value, try again!";
    public static final String OUTPUT_RESULT = "Result:";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printResult(String message, char[][] pyramid) {
        printMessage(message);
        for (char[] row : pyramid) {
            for (char el : row) {
                if (el != 0) {
                    System.out.print(el);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
