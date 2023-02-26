package src.com.ua.lesson14.repository;

import src.com.ua.lesson14.domain.Student;
import src.com.ua.lesson14.domain.Teacher;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class MembersArrayRepository {
    private static final int SIZE_ARRAY_OF_TEACHERS = 4;
    private static final int SIZE_ARRAY_OF_STUDENTS = 10;
    private static final String[] NAMES = {"Bohdan", "Ivan", "Vasil", "Denis", "Stepan"};
    private static final String[] SECOND_NAMES = {"Tokar", "Makar", "Sloboda", "Nikiforov", "Plastov"};
    private static final String[] STUDENT_GROUP = {"1A", "2B", "3C", "4D"};
    private static final DecimalFormat SCORE_OF_STUDENT_FORMAT = new DecimalFormat("0.00");
    private Student[] allStudents = new Student[SIZE_ARRAY_OF_STUDENTS];
    private Teacher[] allTeachers = new Teacher[SIZE_ARRAY_OF_TEACHERS];

    public MembersArrayRepository() {
        fillArrayOfStudents();
        fillArrayOfTeachers();
    }

    public Student[] findAllStudents() {
        return allStudents;
    }

    public Teacher[] findAllTeachers() {
        return allTeachers;
    }


    private void fillArrayOfStudents() {

        for (int i = 0; i < allStudents.length; i++) {

            int sequenceNumber = i + 1;

            Student student = getRandomStudent();
            student.setNumberOfStudent(sequenceNumber);
            saveMembersInArray(student);
        }

    }

    private void fillArrayOfTeachers() {

        for (int i = 0; i < allTeachers.length; i++) {

            int sequenceNumber = i + 1;

            Teacher teacher = getRandomTeachers();
            teacher.setNumberOfTeacher(sequenceNumber);
            saveMembersInArray(teacher);

        }

    }

    public void saveMembersInArray(Student student) {

        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i] == null) {
                allStudents[i] = student;
                break;
            }
        }

    }

    public void saveMembersInArray(Teacher teacher) {

        for (int i = 0; i < allStudents.length; i++) {
            if (allTeachers[i] == null) {
                allTeachers[i] = teacher;
                break;
            }
        }

    }


    public static Student getRandomStudent() {

        Random random = new Random();
        String name = NAMES[random.nextInt(0, 4)];
        String sureName = SECOND_NAMES[random.nextInt(0, 4)];
        int age = random.nextInt(17, 30);
        double averageScore = Double.parseDouble(SCORE_OF_STUDENT_FORMAT.format(random.nextDouble(2.00, 5.0)));
        String studentGroup = STUDENT_GROUP[random.nextInt(0, 4)];
        String id = random.nextInt(1000, 9000) + "_stud";

        return new Student(name, sureName, age, id, averageScore, studentGroup);

    }

    private static Teacher getRandomTeachers() {

        Random random = new Random();
        String nameSize = NAMES[random.nextInt(0, 4)];
        String lastName = SECOND_NAMES[random.nextInt(0, 4)];
        int age = random.nextInt(17, 30);
        int numberOfWorksHours = random.nextInt(20, 50);
        int salary = random.nextInt(2000, 25000);
        String id = random.nextInt(1000, 9000) + "_teach";

        return new Teacher(nameSize, lastName, age, id, numberOfWorksHours, salary);

    }

    @Override
    public String toString() {
        return "MembersArrayRepository{" +
                "allStudents=" + Arrays.toString(allStudents) +
                ", allTeachers=" + Arrays.toString(allTeachers) +
                '}';
    }
}
