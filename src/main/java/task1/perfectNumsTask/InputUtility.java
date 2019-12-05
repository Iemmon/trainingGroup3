package task1.perfectNumsTask;

import java.util.Scanner;

public class InputUtility {

    private static Scanner scanner = new Scanner(System.in);

    public static int inputSizeValue(PerfectView perfectView) {
        perfectView.printMessage(perfectView.INPUT_LIMIT);
        int input = -1;
        while (!scanner.hasNextInt() || ((input = scanner.nextInt()) < 6)) {
            perfectView.printMessage(perfectView.WRONG_INPUT + "\n" + perfectView.INPUT_LIMIT);
            scanner.next();
        }
        return input;
    }

}
