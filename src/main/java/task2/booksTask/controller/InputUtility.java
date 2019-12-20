package task2.booksTask.controller;

import task2.booksTask.view.BooksView;
import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);
    private static BooksView view;

    public InputUtility(BooksView view){
        this.view = view;
    }

    public int inputMenuNumber(int limit) {
        int input;
        do {
            ignoreNonIntValue();
            input = scanner.nextInt();
        } while (input < 0 || input > limit);
        return input;
    }

    public int enterYear() {
        int input;
        do {
            view.print(OptionMessage.ENTER_YEAR_MESSAGE.toString());
            ignoreNonIntValue();
            input = scanner.nextInt();
        }
        while (input < 1920 || input > 2019);
        return input;
    }

    private void ignoreNonIntValue(){
        while (!scanner.hasNextInt()) {
            view.print(OptionMessage.WRONG_INPUT_MESSAGE.toString());
        }
    }
}
