package task2.booksTask;

public class Main {

    public static void main(String[] args) {
        BooksModel model = new BooksModel();
        BooksView view = new BooksView();
        BooksController controller = new BooksController(model, view);
        controller.run();
    }
}
