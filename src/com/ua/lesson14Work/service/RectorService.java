package src.com.ua.lesson14Work.service;

import src.com.ua.lesson14Work.domain.Student;
import src.com.ua.lesson14Work.domain.TaxType;
import src.com.ua.lesson14Work.domain.Teacher;
import src.com.ua.lesson14Work.repository.MembersArrayRepository;
import src.com.ua.lesson14Work.repository.MembersRepository;

public class RectorService {

    private static final String TABLE_TEACHERS_FORMAT = "|%-10s |%-20s |%-20s |%-20s |%-15s |%-15s |%-15s |%-11s|";
    private static final String TABLE_STUDENTS_FORMAT = "|%-10s |%-20s |%-20s |%-20s |%-15s |%-15s |%-15s|";
    private static final int LINE_SIZE_STUDENTS = 129;
    private static final int LINE_SIZE_TEACHERS = 141;

    private final MembersRepository membersRepository;

    public RectorService() {
        membersRepository = new MembersArrayRepository();
    }


    public void printStudents() {
        printHeaderForStudents();
        for (Student member : membersRepository.findAllStudents()) {
            if (member != null) {
                String body = String.format(TABLE_STUDENTS_FORMAT,
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
        printDividerStudents();
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

    public Teacher[] findTeacherByTaxType(TaxType type) {
        int size = 0;
        Teacher[] allTeachers = membersRepository.findAllTeachers();
        for (Teacher teacher : allTeachers) {
            if (teacher != null && teacher.getTypeOfEmploee() == type) {
                size++;
            }
        }

        Teacher[] filteredEmployees = new Teacher[size];
        int index = 0;
        for (Teacher teacher : allTeachers) {
            if (teacher != null && teacher.getTypeOfEmploee() == type) {
                filteredEmployees[index] = teacher;
                index++;
            }
        }

        return filteredEmployees;
    }

    public void printTeachers() {
        printHeaderForTeachers();
        for (Teacher member : membersRepository.findAllTeachers()) {
            if (member != null) {
                String body = String.format(TABLE_TEACHERS_FORMAT,
                        member.getNumberOfTeacher(),
                        member.getId(),
                        member.getFirstName(),
                        member.getSecondName(),
                        member.getAge(),
                        member.getNumberOfWorksHours(),
                        member.getSalary(),
                        member.getTypeOfEmploee());
                System.out.println(body);
            }
        }
        printDividerTeachers();
    }

    private void printHeaderForStudents() {
        printDividerStudents();
        System.out.printf((TABLE_STUDENTS_FORMAT) + "%n", "Number", "ID", "First Name", "Last Name", "Age", "Student Group", "Average Score");
        printDividerStudents();
    }

    private void printHeaderForTeachers() {
        printDividerTeachers();
        System.out.printf((TABLE_TEACHERS_FORMAT) + "%n", "Number", "ID", "First Name", "Last Name", "Age", "Works Hours", "Salary", "Tax type");
        printDividerTeachers();
    }

    private void printDividerStudents() {
        for (int i = 0; i < LINE_SIZE_STUDENTS; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    private void printDividerTeachers() {
        for (int i = 0; i < LINE_SIZE_TEACHERS; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

}
