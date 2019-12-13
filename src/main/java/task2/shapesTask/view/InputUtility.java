package task2.shapesTask.view;

import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputMenuNumber(ShapeView view, int limit) {
        int input;
        do {
            view.print("Choose option from above");
            while (!scanner.hasNextInt()) {
                view.print(view.WRONG_INPUT);
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input < 1 || input > limit);
        return input;
    }
}
