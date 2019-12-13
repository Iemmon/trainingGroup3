package task2.booksTask.controller;

import task2.booksTask.model.Book;
import task2.booksTask.model.BooksModel;
import task2.booksTask.model.PublisherComparator;
import task2.booksTask.view.BooksView;
import task2.booksTask.view.InputUtility;

public class BooksController {
    private BooksModel model = new BooksModel();
    private BooksView view = new BooksView();
    private DataConverter converter = new DataConverter();

    public void run() {
        int userInput;
        do {
            userInput = InputUtility.inputMenuNumber(view, view.MAIN_MENU, view.MAIN_MENU_LIMIT);
            switch (userInput) {
                case 0:
                    view.print("Bye!");
                    System.exit(0);
                    break;
                case 1:
                    view.print(converter.convertBooks(model.getArrayOfBooks()));
                    break;
                case 2:
                    Book[] books = model.sortByPublisher(new PublisherComparator());
                    view.print(converter.convertBooks(books));
                    break;
                case 3:
                    String[] listA = model.getCurrentAuthors();
                    int nameIndex = InputUtility.inputMenuNumber(view, converter.convertList(listA), listA.length);
                    Book[] booksByAuthor = model.getBookByAuthor(listA[nameIndex]);
                    view.print(converter.convertBooks(booksByAuthor));
                    break;
                case 4:
                    String[] listP = model.getCurrentPublishers();
                    int pubIndex = InputUtility.inputMenuNumber(view, converter.convertList(listP), listP.length);
                    Book[] booksByPublisher = model.getBookByPublisher(listP[pubIndex]);
                    view.print(converter.convertBooks(booksByPublisher));
                    break;
                case 5:
                    int year = InputUtility.enterYear(view);
                    view.print(converter.convertBooks(model.getBooksAfterYear(year)));
                    break;
                case 6:
                    model.generateNewBooks();
                    view.print(converter.convertBooks(model.getArrayOfBooks()) + "\nList of books is updated!");
                    break;
            }
        } while (userInput != 0);
    }
}
