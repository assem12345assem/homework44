package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String fullName;
    private String password;
    private List<Book> currentBooks = new ArrayList<>();
    private List<Book> pastBooks = new ArrayList<>();

    public Employee(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
        password = "12345";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public List<Employee> allEmployees = new ArrayList<>();


    public List<Employee> getAllEmployees() {
        return allEmployees;
    }

    public List<Book> getCurrentBooks() {
        return currentBooks;
    }

    public List<Book> getPastBooks() {
        return pastBooks;
    }
    public void takeBook(Book b) {
        if(currentBooks.size() < 2) {
            currentBooks.add(b);
        } else {
            System.out.println("You cannot borrow more than 2 books!");
        }
    }
    public void returnBook(Book b) {
        currentBooks.remove(b);
        pastBooks.add(b);
    }
    public void addAllEmployees() {
        allEmployees.add(new Employee(1, "Ivan Ivanov"));
        allEmployees.add(new Employee(2, "Lola Ivanova"));
        allEmployees.add(new Employee(3, "Petr Petrov"));
        allEmployees.add(new Employee(4, "Rita Belova"));
        allEmployees.add(new Employee(5, "Sergei Krasnov"));
    }
}
