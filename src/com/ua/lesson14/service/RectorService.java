package src.com.ua.lesson14.service;

import src.com.ua.lesson14.domain.Student;
import src.com.ua.lesson14.domain.Teacher;
import src.com.ua.lesson14.repository.MembersArrayRepository;

public class RectorService {

    private static final String TABLE_FORMAT = "|%-10s |%-20s |%-20s |%-20s |%-15s |%-15s |%-15s|";
    private static final int LINE_SIZE = 129;
    private MembersArrayRepository memoryArrayRepository;

    public RectorService() {
        memoryArrayRepository = new MembersArrayRepository();
    }


    public void printStudents() {
        printHeaderForStudents();
        for (Student member : memoryArrayRepository.findAllStudents()) {
            if (member != null) {
                String body = String.format(TABLE_FORMAT,
                        member.getNumberOfStudent(),
                        member.getId(),
                        member.getFirstName(),
                        member.getSecondName(),
                        member.getAge(),
                        member.getStudentGroup(),
                        member.getAverageScore());
                System.out.println(body);
            }
        }
        printDivider();
    }

    public void printTeachers() {
        printHeaderForTeachers();
        for (Teacher member : memoryArrayRepository.findAllTeachers()) {
            if (member != null) {
                String body = String.format(TABLE_FORMAT,
                        member.getNumberOfTeacher(),
                        member.getId(),
                        member.getFirstName(),
                        member.getSecondName(),
                        member.getAge(),
                        member.getNumberOfWorksHours(),
                        member.getSalary());
                System.out.println(body);
            }
        }
        printDivider();
    }

    private void printHeaderForStudents() {
        printDivider();
        System.out.printf((TABLE_FORMAT) + "%n", "Number", "ID", "First Name", "Last Name", "Age", "Student Group", "Average Score");
        printDivider();
    }

    private void printHeaderForTeachers() {
        printDivider();
        System.out.printf((TABLE_FORMAT) + "%n", "Number", "ID", "First Name", "Last Name", "Age", "Works Hours", "Salary");
        printDivider();
    }

    private void printDivider() {
        for (int i = 0; i < LINE_SIZE; i++) {
            System.out.print("_");
        }
        System.out.println();
    }
}
