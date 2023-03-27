package src.com.ua.Lesson22;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();

        students.add(new Student("Fialka", 3.5));
        students.add(new Student("Dianov", 4.6));
        students.add(new Student("Globoda", 4.98));
        students.add(new Student("Cestor", 4.2));
        students.add(new Student("Ahaniv", 3.7));
        students.add(new Student("Borostov", 4.76));
        students.add(new Student("Elehov", 2.6));

        System.out.println(students);

//        students.sort(Comparator.comparing(Student::getSureName));

        students.sort(new StudentSureNameComparator());
        System.out.println(students);

//        students.sort(Comparator.comparing(Student::getAverageRate));

        students.sort(new StudentAgeComparator());
        System.out.println(students);


    }
}
