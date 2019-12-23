package task2.booksTask.model;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class BookModelTests {
    private BooksModel model = new BooksModel();
    private Book[] expectedSortedBooks;
    private String[] expectedAuthors;

    @Before
    public void setUp() {
        Book[] books = {new Book("Haunting Theft", "Kishan Yates", "Hallery", 1978, 239, 34.5),
                new Book("Carnival of Lions", "Drew Moss", "Renome", 1999, 45, 7.4),
                new Book("Quicksilver's Arrest", "Olivier Mcdonnell", "Printono", 1899, 79, 67.3),
                new Book("Drive and Doom", "Darcey Thorpe", "Countrytale", 2001, 400, 20.99),
                new Book("Season of Noon", "Luna Cantrell", "BiblioteQ", 2011, 246, 6.99),
                new Book("Drive and Doom", "Drew Moss", "BiblioteQ", 2015, 460, 6.9),
                new Book("Tortured Currents", "Aurora Cain", "Renome", 2018, 325, 15.46),
                new Book("Wicked Shot", "Olivier Mcdonnell", "Renome", 2002, 471, 10.4),
                new Book("Edge of Stairs", "Luna Cantrell", "Countrytale", 2008, 212, 8.7),
                new Book("Save the Bridegroom", "Luna Cantrell", "BiblioteQ", 2015, 567, 23.6)
        };

        model.setArrayOfBooks(books);
        expectedSortedBooks = Arrays.copyOf(books, books.length);
        Arrays.sort(expectedSortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getPublisher().compareToIgnoreCase(book2.getPublisher());
            }
        });

        this.expectedAuthors = new String[]{"Kishan Yates", "Drew Moss", "Olivier Mcdonnell", "Darcey Thorpe", "Luna Cantrell", "Aurora Cain"};
    }

    @Test
    public void testSortByPublisher() {
        Book[] sortedArray = model.sortByPublisher();
        assertEquals(expectedSortedBooks.length, sortedArray.length);
        for (int i = 0; i < expectedSortedBooks.length; i++)
            assertEquals("mismatch at " + i, expectedSortedBooks[i], sortedArray[i]);
    }


    @Test
    public void testGetBookByAuthor() {
        Book[] result = model.getBookByAuthor("Luna Cantrell");
        assertTrue(result.length == 3);
        assertEquals("Luna Cantrell", result[0].getAuthor());
        assertEquals("Luna Cantrell", result[1].getAuthor());
        assertEquals("Luna Cantrell", result[2].getAuthor());

    }

    @Test
    public void testGetBookByPublisher() {
        Book[] result = model.getBookByPublisher("BiblioteQ");
        assertTrue(result.length == 3);
        assertEquals("BiblioteQ", result[0].getPublisher());
        assertEquals("BiblioteQ", result[1].getPublisher());
        assertEquals("BiblioteQ", result[2].getPublisher());

    }

    @Test
    public void testGetCurrentAuthors() {
        String[] result = model.getCurrentAuthors();
        assertEquals(result.length, expectedAuthors.length);
        for(int i = 0; i < result.length; i++){
            assertEquals(result[i], expectedAuthors[i]);
        }
    }
}
