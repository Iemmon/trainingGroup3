package task2.booksTask;

import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);


    public static int chooseBasicOption(BooksView view) {
        view.printMessage(view.CHOOSE_OPTION);
        while (!scanner.hasNext("[0-7]{1}")) {
            view.printMessage(view.WRONG_INPUT + "\n" + view.CHOOSE_OPTION);
            scanner.next();
        }
        return Math.abs(scanner.nextInt());
    }

    public static int chooseAuthorFromList(BooksView view, BooksModel model) {
        int limit = model.getCurrentAuthorsNames().length;
        int input;
        do {
            view.printMessage(view.CHOOSE_AUTHOR);
            view.printListOfNames(model.getCurrentAuthorsNames());
            while (!scanner.hasNextInt()){
                view.printMessage(view.WRONG_INPUT);
                view.printListOfNames(model.getCurrentAuthorsNames());
                scanner.next();
            }
            input = scanner.nextInt();
        }
        while (input < 0 || input > limit);
        return input;
    }

    public static int choosePublisherFromList(BooksView view, BooksModel model) {
        int limit = model.getCurrentPublishers().length;
        int input;
        do {
            view.printMessage(view.CHOOSE_PUBLISHER);
            view.printListOfNames(model.getCurrentPublishers());
            while (!scanner.hasNextInt()){
                view.printMessage(view.WRONG_INPUT);
                view.printListOfNames(model.getCurrentPublishers());
                scanner.next();
            }
            input = scanner.nextInt();
        }
        while (input < 0 || input > limit);
        return input;
    }

    public static int enterYear(BooksView view) {
        int input;
        do {
            view.printMessage(view.ENTER_YEAR);
            while (!scanner.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT);
            }
            input = scanner.nextInt();
        }
        while (input < 1920 || input > 2019);

        return input;
    }


}
