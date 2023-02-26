package src.com.ua.lesson14;

import src.com.ua.lesson14.domain.MembersOfUniversity;
import src.com.ua.lesson14.domain.Student;
import src.com.ua.lesson14.domain.Teacher;
import src.com.ua.lesson14.service.RectorService;

public class Main {

    public static void main(String[] args) {

        RectorService rector = new RectorService();
        MembersOfUniversity student = new Student();
        MembersOfUniversity teacher = new Teacher();

        rector.sortStudentsOfAverageScore();
        student.determinePersonality();
        rector.printStudents();
        teacher.determinePersonality();
        rector.printTeachers();

    }


}
