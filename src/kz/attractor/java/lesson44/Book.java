package kz.attractor.java.lesson44;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.imageio.plugins.jpeg.JPEGQTable;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String author;
    private JPEGQTable image;
    private boolean status;
    public List<Book> allBooks = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public JPEGQTable getImage() {
        return image;
    }

    public void setImage(JPEGQTable image) {
        this.image = image;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        status = false;
    }
    public void addBooks() {
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
    }

}
