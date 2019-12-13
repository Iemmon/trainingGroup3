package task2.booksTask.controller;

import task2.booksTask.model.Book;

public class DataConverter {

    public String convertBooks(Book[] books){
        String result = "";
        for (Book book : books) {
            result += book.toString();
        }
        return result;
    }

    public String convertList(String[] names){
        int position = 0;
        String result = "";
        for (String name : names){
           result = result + String.format("%d. - %s", position++, name + "\n");
        }
        return result;
    }

}
