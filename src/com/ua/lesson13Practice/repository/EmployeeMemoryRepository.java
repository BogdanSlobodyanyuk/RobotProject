package src.com.ua.lesson13Practice.repository;

import src.com.ua.lesson13Practice.domain.Employee;

import java.util.Random;

public class EmployeeMemoryRepository {

    public static final int SIZE = 10;
    private Employee[] employees = new Employee[SIZE];

    public EmployeeMemoryRepository() {
        fillArrayWithRandomEmployees();
    }

    public Employee[] findAll() {
        return employees;
    }

    public void save(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    private void fillArrayWithRandomEmployees() {
        for (int i = 0; i < 5; i++) {
            Employee employee =  getRandomEmployee();
            employee.setId(i);

            save(employee);
        }

    }

    private static Employee getRandomEmployee() {
        Random random = new Random();
        int nameSize = random.nextInt(5, 8);
        String firstName = generateRandomNameString(nameSize);
        String lastName = generateRandomNameString(nameSize);
        int age = random.nextInt(18, 62);
        int salary = random.nextInt(300, 6200);

        return new Employee(0, firstName, lastName, age, salary);
    }

    private static String generateRandomNameString(int size) {
        String alphaNumericStr = "abcdefghijklmnopqrstuvxyz";
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < random.nextInt(1, 3); j++) {
                result.append(alphaNumericStr.charAt(random.nextInt(0, alphaNumericStr.length())));
            }
        }
        result.setCharAt(0, Character.toUpperCase(result.charAt(0)));

        return result.toString();
    }

}
