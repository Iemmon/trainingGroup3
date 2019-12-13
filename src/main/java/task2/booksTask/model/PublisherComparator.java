package task2.booksTask.model;

import java.util.Comparator;

public class PublisherComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getPublisher().compareToIgnoreCase(b2.getPublisher());
    }
}
