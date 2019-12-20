package task2.booksTask.controller;

import task2.booksTask.model.Book;
import task2.booksTask.model.BooksModel;
import task2.booksTask.view.BooksView;

public class BooksController {
    private BooksModel model = new BooksModel();
    private BooksView view = new BooksView();
    private DataConverter converter = new DataConverter();
    private static final int MAIN_MENU_LIMIT = 6;
    private InputUtility input = new InputUtility(view);

    public void run() {
        int userInput;
        do {
            view.print(OptionMessage.MAIN_MENU_MESSAGE.toString());
            userInput = input.inputMenuNumber(MAIN_MENU_LIMIT);
            switch (userInput) {
                case 0:
                    view.print("Bye!");
                    System.exit(0);
                    break;
                case 1:
                    performGetArray();
                    break;
                case 2:
                    performSortByPublisher();
                    break;
                case 3:
                    performChooseBooksByAuthor();
                    break;
                case 4:
                    performChooseBooksByPublisher();
                    break;
                case 5:
                    performGetBooksAfterYear();
                    break;
                case 6:
                    performGenerateNewBooks();
                    break;
            }
        } while (userInput != 0);
    }

    private void performChooseBooksByPublisher(){
        String[] listPub = model.getCurrentPublishers();
        view.print(converter.convertList(listPub));
        int pubIndex = input.inputMenuNumber(listPub.length);
        Book[] booksByPublisher = model.getBookByPublisher(listPub[pubIndex]);
        view.print(converter.convertBooks(booksByPublisher));
    }

    private void performChooseBooksByAuthor(){
        String[] listAuth = model.getCurrentAuthors();
        view.print(converter.convertList(listAuth));
        int nameIndex = input.inputMenuNumber(listAuth.length);
        Book[] booksByAuthor = model.getBookByAuthor(listAuth[nameIndex]);
        view.print(converter.convertBooks(booksByAuthor));
    }

    private void performSortByPublisher(){
        Book[] books = model.sortByPublisher();
        view.print(converter.convertBooks(books));
    }

    private void performGetArray(){
        view.print(converter.convertBooks(model.getArrayOfBooks()));
    }

    private void performGetBooksAfterYear(){
        int year = input.enterYear();
        view.print(converter.convertBooks(model.getBooksAfterYear(year)));
    }

    private void performGenerateNewBooks(){
        model.generateNewBooks();
        view.print(converter.convertBooks(model.getArrayOfBooks()) + OptionMessage.UPDATE_MESSAGE.toString());
    }

}
