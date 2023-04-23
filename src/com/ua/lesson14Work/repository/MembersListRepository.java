package src.com.ua.lesson14Work.repository;

import src.com.ua.lesson14Work.domain.Student;
import src.com.ua.lesson14Work.domain.TaxType;
import src.com.ua.lesson14Work.domain.Teacher;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MembersListRepository implements MemberRepositoryForList {

    private static final List<String> NAMES = List.of("Bohdan", "Ivan", "Vasil", "Denis", "Stepan");
    private static final List<String> SECOND_NAMES = List.of("Tokar", "Makar", "Sloboda", "Nikiforov", "Plastov");
    private static final List<String> STUDENT_GROUP = List.of("1A", "2B", "3C", "4D");
    private static final DecimalFormat SCORE_OF_STUDENT_FORMAT = new DecimalFormat("0.00");
    private static final int NUNBERS_OF_TEACHERS = 4;
    private static final int NUMBERS_OF_STUDENTS = 10;
    private final List<Student> allStudents = new ArrayList<>();
    private final List<Teacher> allTeachers = new ArrayList<>();

    public MembersListRepository() {
        fillArrayOfStudents();
        fillArrayOfTeachers();
    }

    private void fillArrayOfStudents() {

        for (int i = 0; i < NUMBERS_OF_STUDENTS; i++) {

            int sequenceNumber = i + 1;

            Student student = getRandomStudent();
            student.setNumberOfStudent(sequenceNumber);
            saveMembersInList(student);
        }

    }

    private void fillArrayOfTeachers() {

        for (int i = 0; i < NUNBERS_OF_TEACHERS; i++) {

            int sequenceNumber = i + 1;

            Teacher teacher = getRandomTeachers();
            teacher.setNumberOfTeacher(sequenceNumber);
            saveMembersInList(teacher);

        }

    }

    @Override
    public void saveMembersInList(Student student) {

            allStudents.add(student);
    }

    @Override
    public void saveMembersInList(Teacher teacher) {
            allTeachers.add(teacher);
    }

    @Override
    public List<Student> findAllStudents() {
        return allStudents;
    }

    @Override
    public List<Teacher> findAllTeachers() {
        return allTeachers;
    }

    public static Student getRandomStudent() {

        Random random = new Random();
        String name = NAMES.get(random.nextInt(0, 4));
        String sureName = SECOND_NAMES.get(random.nextInt(0, 4));
        int age = random.nextInt(17, 30);
        double averageScore = Double.parseDouble(SCORE_OF_STUDENT_FORMAT.format(random.nextDouble(2.00, 5.0)));
        String studentGroup = STUDENT_GROUP.get(random.nextInt(0, 4));
        String id = random.nextInt(1000, 9000) + "_stud";

        return new Student(name, sureName, age, id, averageScore, studentGroup);

    }

    private static Teacher getRandomTeachers() {

        Random random = new Random();
        String nameSize = NAMES.get(random.nextInt(0, 4));
        String lastName = SECOND_NAMES.get(random.nextInt(0, 4));
        int age = random.nextInt(17, 30);
        int numberOfWorksHours = random.nextInt(20, 50);
        int salary = numberOfWorksHours * 75;
        String id = random.nextInt(1000, 9000) + "_teach";
        int typeNumber = random.nextInt(2);
        TaxType typeOfTeacher = typeNumber == 0 ? TaxType.GENERAL_TAX : TaxType.THIRD_GROUP;

        return new Teacher(nameSize, lastName, age, id, numberOfWorksHours, salary, typeOfTeacher);

    }

    @Override
    public String toString() {
        return "MembersListRepository{" +
                "allStudents=" + allStudents +
                ", allTeachers=" + allTeachers +
                '}';
    }
}
