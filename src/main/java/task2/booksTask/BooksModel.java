package task2.booksTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class BooksModel {
    private Book[] arrayOfBooks;
    private String[] currentAuthorsNames;
    private String[] currentPublishers;
    private BookCreator bookCreator = new BookCreator();

    public BooksModel (){
        createSetOfBooks();
        fillCurrentAuthors();
        fillCurrentPublishers();
    }

    public void createSetOfBooks() {
        Random random = new Random();
        Book[] books = new Book[random.nextInt(20) + 10];
        for (int i = 0; i < books.length; i++) {
            books[i] = bookCreator.generateBookObject();
        }
        this.arrayOfBooks = books;
    }

    public Book[] getBookByAuthor(String authorName) {
        Book[] booksByAuthor = new Book[arrayOfBooks.length];
        int index = 0;
        for (Book book : arrayOfBooks) {
            if (book.getAuthor().toLowerCase().contains(authorName.toLowerCase())) {
                booksByAuthor[index++] = book;
            }
        }
        return Arrays.copyOfRange(booksByAuthor, 0, index, Book[].class);
    }

    public Book[] getBookByPublisher(String publishingName) {
        Book[] books = new Book[arrayOfBooks.length];
        int index = 0;
        for (Book book : arrayOfBooks) {
            if (book.getPublisher().toLowerCase().contains(publishingName.toLowerCase())) {
                books[index++] = book;
            }
        }
        return Arrays.copyOfRange(books, 0, index, Book[].class);
    }

    public Book[] getBooksAfterYear(int year) {
        Book[] books = new Book[arrayOfBooks.length];
        int index = 0;
        for (Book book : arrayOfBooks) {
            if (book.getYear() >= year) {
                books[index++] = book;
            }
        }
        return Arrays.copyOfRange(books, 0, index, Book[].class);
    }

    public void sortByPublisher() {
        Arrays.sort(arrayOfBooks, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getPublisher().compareToIgnoreCase(book2.getPublisher());
            }
        });

    }

    private void fillCurrentAuthors() {
        String[] authorNames = new String[this.arrayOfBooks.length];
        int index = 0;
        for (int i = 0; i < this.arrayOfBooks.length; i++) {
            for (String name : authorNames) {
                if(name == null){
                    authorNames[index++] = this.arrayOfBooks[i].getAuthor();
                    break;
                }
                if (this.arrayOfBooks[i].getAuthor().contains(name)) {
                    break;
                }
            }
        }
        this.currentAuthorsNames = Arrays.copyOfRange(authorNames, 0, index, String[].class);
    }

    private void fillCurrentPublishers() {
        String[] publisherNames = new String[this.arrayOfBooks.length];
        int index = 0;
        for (int i = 0; i < this.arrayOfBooks.length; i++) {
            for (String name : publisherNames) {
                if(name == null){
                    publisherNames[index++] = this.arrayOfBooks[i].getPublisher();
                    break;
                }
                if (this.arrayOfBooks[i].getPublisher().contains(name)) {
                    break;
                }
            }
        }
        this.currentPublishers = Arrays.copyOfRange(publisherNames, 0, index, String[].class);
    }

    public String[] getCurrentAuthorsNames() {
        return currentAuthorsNames;
    }

    public String[] getCurrentPublishers() {
        return currentPublishers;
    }

    public Book[] getArrayOfBooks() {
        return arrayOfBooks;
    }


}
