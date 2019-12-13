package task2.booksTask.view;

import task2.booksTask.model.BooksModel;
import task2.booksTask.view.BooksView;

import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputMenuNumber(BooksView view, String message, int limit) {
        int input;
        do {
            view.print(view.CHOOSE_OPTION_NUMBER + "\n" + message);
            while (!scanner.hasNextInt()) {
                view.print(view.WRONG_INPUT);
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input < 0 || input > limit);
        return input;
    }

    public static int enterYear(BooksView view) {
        int input;
        do {
            view.print(view.ENTER_YEAR);
            while (!scanner.hasNextInt()) {
                view.print(view.WRONG_INPUT);
            }
            input = scanner.nextInt();
        }
        while (input < 1920 || input > 2019);
        return input;
    }


}
