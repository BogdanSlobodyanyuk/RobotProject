package src.com.ua.lesson18.repository;

import src.com.ua.lesson18.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsCollections {


    private static final List<Student> students = new ArrayList<>();

    public static List<Student> getStudents() {
        return students;
    }

    private static Student createStudent(int numberOfStudent) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input students age of " + numberOfStudent + " student");
        int age = scanner.nextInt();

        System.out.println("Input students name of " + numberOfStudent + " student");
        String name = scanner.next();

        System.out.println("Input students second name of " + numberOfStudent + " student");
        String secondName = scanner.next();

        return new Student(age, name, secondName);
    }

    public static void fillStudentsInCollectionOfStudents(int quantity) {

        for (int i = 0; i < quantity; i++) {
            students.add(createStudent(i+1));
        }
    }
}
