package src.com.ua.lesson13Practice.service;

import src.com.ua.lesson13Practice.domain.Employee;
import src.com.ua.lesson13Practice.repository.EmployeeMemoryRepository;

public class EmployeeService {

    private static final String TABLE_FORMAT = "|%-5s |%-20s |%-20s |%-10s |%-10s|";
    private static final int LINE_SIZE = 75;
    private EmployeeMemoryRepository employeeMemoryRepository;

    public EmployeeService() {
        employeeMemoryRepository = new EmployeeMemoryRepository();
    }

    public void printEmployees() {
        printHeader();
        for (Employee employee : employeeMemoryRepository.findAll()) {
            if (employee != null) {
                String body = String.format(TABLE_FORMAT,
                        employee.getId(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getAge(),
                        employee.getSalary());
                System.out.println(body);
            }
        }
    }

    private void printHeader() {
        printDivider();
        System.out.printf((TABLE_FORMAT) + "%n", "id", "firstName", "lastName", "age", "salary");
        printDivider();
    }

    public void printEmployee(Employee employee) {
        printHeader();
        String body = String.format(TABLE_FORMAT,
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getAge(),
                employee.getSalary());
        System.out.println(body);
    }

    public Employee[] findAll() {
        return employeeMemoryRepository.findAll();
    }

    public Employee findEmployeeWithMaxSalary(Employee[] employees) {
        int maxSalary = 0;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
        }

        return result;
    }

    public Employee findEmployeeWithMinSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public double calculateTaxes(Employee[] employees) {
        double taxes = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                taxes += employee.getSalary() * 0.195;
            }
        }
        return taxes;
    }

    private void printDivider() {
        for (int i = 0; i < LINE_SIZE; i++) {
            System.out.print("_");
        }
        System.out.println();
    }
}

