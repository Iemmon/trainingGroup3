package task2.booksTask;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private int year;
    private int numOfPages;
    private double price;

    public Book(String title, String author, String publisher, int year, int numOfPages, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numOfPages = numOfPages;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-18s %s", "Book title: ", title) + '\n' +
                String.format("%-18s %s", "author: ", author) + '\n' +
                String.format("%-5s %s", "publishing house: ", publisher) + '\n' +
                String.format("%-18s %d", "year: ", year) + '\n' +
                String.format("%-18s %d", "number of pages: ", numOfPages) + '\n' +
                String.format("%-18s %.2f", "price: ", price) + '\n' +
                "-------------------------------------";
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

}
