package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class Query {
    private int id;
    private Employee employee;
    private Book book;
    private Library library;

    private String employeeName;
    private String bookName;
    private String bookAuthor;
    private int bookId;
    private boolean currentPast;
    private List<Query> queryList = new ArrayList<>();
    private List<Employee> allEmployees = employee.getAllEmployees();

    private List<Library> log = library.getLog();
    private List<Book> allBooks = new ArrayList<>();
    public Query(String employeeName, String bookName, String bookAuthor, int bookId, boolean currentPast) {
        this.employeeName = employeeName;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.currentPast = currentPast;
    }
    public void makeQuery(int employeeId) {
        Employee e = allEmployees.get(employeeId);
        List<Book> currBooks = e.getCurrentBooks();
        List<Book> pastBooks = e.getPastBooks();
        for (Book b: currBooks) {
            queryList.add(new Query(employeeName = e.getFullName(), bookName = b.getTitle(), bookAuthor = b.getAuthor(), bookId = b.getId(), true));
        }
        for (Book b: currBooks) {
            queryList.add(new Query(employeeName = e.getFullName(), bookName = b.getTitle(), bookAuthor = b.getAuthor(), bookId = b.getId(), false));
        }
    }

    public List<Query> getQueryList() {
        return queryList;
    }
}
