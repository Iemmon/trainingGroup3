package task2.booksTask.model;

import java.util.Arrays;
import java.util.Comparator;

public class BooksModel {
    private Book[] arrayOfBooks;

    public BooksModel(){
        generateNewBooks();
    }

    public void generateNewBooks(){
        arrayOfBooks = new BookArrayCreator().createSetOfBooks();
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

    public Book[] sortByPublisher(Comparator comparator) {
        Book[] sortedArr = Arrays.copyOf(arrayOfBooks, arrayOfBooks.length);
        Arrays.sort(sortedArr, comparator);
        return sortedArr;
    }

    public String[] getCurrentAuthors() {
        String[] authorNames = new String[arrayOfBooks.length];
        int index = 0;
        for (int i = 0; i < arrayOfBooks.length; i++) {
            for (String name : authorNames) {
                if(name == null){
                    authorNames[index++] = arrayOfBooks[i].getAuthor();
                    break;
                }
                if (arrayOfBooks[i].getAuthor().contains(name)) {
                    break;
                }
            }
        }
        return Arrays.copyOfRange(authorNames, 0, index, String[].class);
    }

    public String[] getCurrentPublishers() {
        String[] publisherNames = new String[arrayOfBooks.length];
        int index = 0;
        for (int i = 0; i < arrayOfBooks.length; i++) {
            for (String name : publisherNames) {
                if(name == null){
                    publisherNames[index++] = arrayOfBooks[i].getPublisher();
                    break;
                }
                if (this.arrayOfBooks[i].getPublisher().contains(name)) {
                    break;
                }
            }
        }
        publisherNames = Arrays.copyOfRange(publisherNames, 0, index, String[].class);
        return publisherNames;
    }

    public Book[] getArrayOfBooks() {
        return arrayOfBooks;
    }


}
