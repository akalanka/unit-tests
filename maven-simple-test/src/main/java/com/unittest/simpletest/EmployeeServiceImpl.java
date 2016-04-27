package com.unittest.simpletest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akalanka on 1/16/16.
 */
public class EmployeeServiceImpl {

    private List<Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new ArrayList<Employee>();
        employees.add(new Employee("akalanka", "senevirathne", 30));
        employees.add(new Employee("susith", "perera", 35));
        employees.add(new Employee("vijitha", "rathnayake", 29));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        if (employeeExists(employee)) {
            throw new ApplicationException("Employee already exist");
        } else {
            employee.setId(employees.size() + 1);
            getEmployees().add(employee);
        }
    }

    private boolean employeeExists(Employee employee) {
        return employees.contains(employee);
    }
}
