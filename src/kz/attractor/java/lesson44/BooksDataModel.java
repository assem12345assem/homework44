package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class BooksDataModel {
    private Book book;
    private Book book1;


    private List<Book> allBooks = new ArrayList<>();


    public BooksDataModel() {
        allBooks.add(new Book(1, "Pride and Prejudice", "Jane Austen"));
        allBooks.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        allBooks.add(new Book(3, "One Hundred Years of Solitude", "Gabriel García Márquez"));
        allBooks.add(new Book(4, "In Cold Blood","Truman Capote"));
        allBooks.add(new Book(5, "The Great Gatsby","F. Scott Fitzgerald"));
        allBooks.add(new Book(6, "Wide Sargasso Sea","Jean Rhys"));
        allBooks.add(new Book(7, "Brave New World","Aldous Huxley"));
        allBooks.add(new Book(8, " I Capture The Castle","Dodie Smith"));
        allBooks.add(new Book(9, "Jane Eyre","Charlotte Bronte"));
        allBooks.add(new Book(10, "Crime and Punishment","Fyodor Dostoevsky"));
        book1 = allBooks.get(0);


    }

    public List<Book> getAllBooks() {
        return allBooks;
    }
    public Book getBook1() {return book1;}

}

