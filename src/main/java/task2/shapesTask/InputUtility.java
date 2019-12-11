package task2.shapesTask;

import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputMenuNumber(ShapesView view, String message, int menuLimit) {
        int input;
        do {
            view.printMessage(message);
            while (!scanner.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT);
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input <= 0 || input > menuLimit);
        return input;
    }

}
