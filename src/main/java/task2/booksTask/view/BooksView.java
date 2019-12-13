package task2.booksTask.view;

public class BooksView {
    public static final String MAIN_MENU =
            "1. Print list of books\n" +
            "2. Sort list by publishing house\n" +
            "3. Get books of certain author\n" +
            "4. Get books of certain publishing house\n" +
            "5. Get books published after certain year\n" +
            "6. Create a new set of books" + "\n" +
            "0. Exit program";
    public static final String CHOOSE_OPTION_NUMBER = "Choose option number from menu: ";
    public static final int MAIN_MENU_LIMIT = 6;
    public static final String ENTER_YEAR = "I'd like to see books published after(Enter year):";
    public static final String WRONG_INPUT = "Invalid action, try again:";

    public void print(String message) {
        System.out.println(message);
    }

}
