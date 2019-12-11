package task2.booksTask;

public class BooksView {

    public static final String CHOOSE_OPTION = "Choose option from menu:\n" +
            "1. Print list of books\n" +
            "2. Sort list by publishing house\n" +
            "3. Get books of certain author\n" +
            "4. Get books of certain publishing house\n" +
            "5. Get books published after certain year\n" +
            "6. Create a new set of books" + "\n" +
            "0. Exit program";

    public static final String CHOOSE_AUTHOR = "Choose author from the list: ";
    public static final String CHOOSE_PUBLISHER = "Choose publisher from the list: ";
    public static final String ENTER_YEAR = "I'd like to see books published after(Enter year):";

    public static final String WRONG_INPUT = "Invalid action, try again:";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void printListOfNames(String[] names){
        int position = 0;
        for (String name : names){
            System.out.println(position++ + ". - " + name);
        }
    }
}
