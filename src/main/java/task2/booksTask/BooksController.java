package task2.booksTask;

public class BooksController {
    private BooksModel model;
    private BooksView view;

    public BooksController(BooksModel model, BooksView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int userInput;
        Book[] resultArray;
        do {
            userInput = InputUtility.chooseBasicOption(view);
            switch (userInput) {
                case 0:
                    view.printMessage("Bye!");
                    System.exit(0);
                    break;
                case 1:
                    view.printBooks(model.getArrayOfBooks());
                    break;
                case 2:
                    model.sortByPublisher();
                    view.printBooks(model.getArrayOfBooks());
                    break;
                case 3:
                    int nameIndex = InputUtility.chooseAuthorFromList(view, model);
                    String name = model.getCurrentAuthorsNames()[nameIndex];
                    view.printBooks(model.getBookByAuthor(name));
                    break;
                case 4:
                    int publisherIndex = InputUtility.choosePublisherFromList(view, model);
                    name = model.getCurrentPublishers()[publisherIndex];
                    view.printBooks(model.getBookByPublisher(name));
                    break;
                case 5:
                    int year = InputUtility.enterYear(view);
                    view.printBooks(model.getBooksAfterYear(year));
                    break;
                case 6:
                    model.createSetOfBooks();
                    view.printMessage("List of books id updated");
                    break;
            }
        } while (userInput != 0);
    }
}
