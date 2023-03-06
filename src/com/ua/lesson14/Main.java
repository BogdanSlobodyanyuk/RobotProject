package src.com.ua.lesson14;

import src.com.ua.lesson14.domain.MemberOfUniversity;
import src.com.ua.lesson14.domain.Student;
import src.com.ua.lesson14.domain.Teacher;
import src.com.ua.lesson14.service.RectorService;

public class Main {

    public static void main(String[] args) {

        RectorService rector = new RectorService();
        MemberOfUniversity student = new Student();
        MemberOfUniversity teacher = new Teacher();

        rector.sortStudentsOfAverageScore();
        rector.sortTeacherOfWorksHours();
        student.determinePersonality();
        rector.printStudents();
        teacher.determinePersonality();
        rector.printTeachers();



    }


}
