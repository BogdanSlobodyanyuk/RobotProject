package src.com.ua.lesson14.service;

import src.com.ua.lesson14.domain.Student;
import src.com.ua.lesson14.domain.Teacher;
import src.com.ua.lesson14.repository.MembersArrayRepository;
import src.com.ua.lesson14.repository.MembersRepository;

public class RectorService {

    private static final String TABLE_FORMAT = "|%-10s |%-20s |%-20s |%-20s |%-15s |%-15s |%-15s|";
    private static final int LINE_SIZE = 129;
    private final MembersRepository membersRepository;

    public RectorService() {
        membersRepository = new MembersArrayRepository();
    }


    public void printStudents() {
        printHeaderForStudents();
        for (Student member : membersRepository.findAllStudents()) {
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

    public void sortStudentsOfAverageScore() {

        Student[] students = membersRepository.findAllStudents();
        Student temp;
        for (int i = 0; i < students.length; i++) {
            int num = i + 1;
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getAverageScore() > students[j].getAverageScore()) {
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                    students[i].setNumberOfStudent(num);
                }
                students[students.length - 1].setNumberOfStudent(students.length);
            }
        }
    }

    public void sortTeacherOfWorksHours() {

        Teacher[] teachers = membersRepository.findAllTeachers();
        Teacher temp;
        for (int i = 0; i < teachers.length; i++) {
            int num = i + 1;
            for (int j = i + 1; j < teachers.length; j++) {
                if (teachers[i].getNumberOfWorksHours() > teachers[j].getNumberOfWorksHours()) {
                    temp = teachers[i];
                    teachers[i] = teachers[j];
                    teachers[j] = temp;
                    teachers[i].setNumberOfTeacher(num);
                }
                teachers[teachers.length - 1].setNumberOfTeacher(teachers.length);
            }
        }
    }

    public void printTeachers() {
        printHeaderForTeachers();
        for (Teacher member : membersRepository.findAllTeachers()) {
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
