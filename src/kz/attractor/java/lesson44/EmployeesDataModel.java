package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class EmployeesDataModel {
    private Book book;
    private Employee employee;
    private Library library;
    private Query query;
    private List<Book> allBooks = new ArrayList<>();

    private List<Employee> allEmployees = employee.getAllEmployees();
    private List<Library> log = new ArrayList<>();
    private List<Query> queryList = new ArrayList<>();
    public EmployeesDataModel() {


        query.makeQuery(1);
        queryList = query.getQueryList();
    }
    public List<Employee> getAllEmployees() {
        return allEmployees;
    }

    public List<Query> getQueryList() {
        return queryList;
    }
}
