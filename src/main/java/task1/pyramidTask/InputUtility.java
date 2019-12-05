package task1.pyramidTask;

import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputSizeValue(PyramidView pyramid) {
        pyramid.printMessage(pyramid.INPUT_PYRAMID_HEIGHT);
        int input = -1;
        while (!scanner.hasNextInt() || ((input = scanner.nextInt()) < 2)) {
            pyramid.printMessage(pyramid.WRONG_INPUT + "\n" + pyramid.INPUT_PYRAMID_HEIGHT);
            scanner.next();
        }
        return input;
    }

}
