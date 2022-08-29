package kz.attractor.java.lesson44;

import javax.swing.plaf.basic.BasicBorders;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private LocalDate date;
    private Employee employee;
    private Book book;
    private Action action;
    private List<Employee> allEmployees = employee.getAllEmployees();

    public List<Library> log = new ArrayList<>();
    private List<Book> allBooks = new ArrayList<>();

    public Library(Employee employee, Book book, Action action) {
        date = LocalDate.now();
        this.employee = employee;
        this.book = book;
        this.action = action;
    }

    public void giveBook(Employee e, Book b) {
        if(!b.isStatus()) {
            e.takeBook(b);
            b.setStatus(true);
            log.add(new Library(e, b, action.GIVE_OUT));
        }
    }
    public void takeBook(Employee e, Book b) {
        if(b.isStatus()) {
            e.returnBook(b);
            b.setStatus(false);
            log.add(new Library(e, b, action.TAKE_BACK));
        }
    }
    public void addLog() {
        log.add(new Library(allEmployees.get(1), allBooks.get(1), Action.GIVE_OUT));
        log.add(new Library(allEmployees.get(1), allBooks.get(9), Action.GIVE_OUT));
        log.add(new Library(allEmployees.get(2), allBooks.get(2), Action.GIVE_OUT));
        log.add(new Library(allEmployees.get(2), allBooks.get(3), Action.GIVE_OUT));
        log.add(new Library(allEmployees.get(1), allBooks.get(1), Action.TAKE_BACK));
        log.add(new Library(allEmployees.get(1), allBooks.get(9), Action.TAKE_BACK));
        log.add(new Library(allEmployees.get(2), allBooks.get(1), Action.TAKE_BACK));
        log.add(new Library(allEmployees.get(2), allBooks.get(1), Action.TAKE_BACK));
        log.add(new Library(allEmployees.get(1), allBooks.get(5), Action.GIVE_OUT));
        log.add(new Library(allEmployees.get(1), allBooks.get(5), Action.TAKE_BACK));
        log.add(new Library(allEmployees.get(1), allBooks.get(6), Action.TAKE_BACK));
        log.add(new Library(allEmployees.get(1), allBooks.get(6), Action.TAKE_BACK));
        log.add(new Library(allEmployees.get(1), allBooks.get(7), Action.GIVE_OUT));
        log.add(new Library(allEmployees.get(1), allBooks.get(8), Action.GIVE_OUT));
        log.add(new Library(allEmployees.get(3), allBooks.get(10), Action.GIVE_OUT));
        log.add(new Library(allEmployees.get(3), allBooks.get(10), Action.TAKE_BACK));
        log.add(new Library(allEmployees.get(3), allBooks.get(2), Action.GIVE_OUT));
        log.add(new Library(allEmployees.get(3), allBooks.get(2), Action.TAKE_BACK));
        log.add(new Library(allEmployees.get(1), allBooks.get(4), Action.GIVE_OUT));
        log.add(new Library(allEmployees.get(1), allBooks.get(4), Action.TAKE_BACK));
        log.add(new Library(allEmployees.get(1), allBooks.get(10), Action.GIVE_OUT));
    }
    private boolean needReminder(int x) {
        return x>0;
    }

    public void printBooks(List<Library> books) {

    }
    public void printEmployees(List<Library> listBooks) {

    }

    public List<Library> getLog() {
        return log;
    }
}
