package src.com.ua.lesson18;

import src.com.ua.lesson18.service.TeacherService;

public class Main {
    public static void main(String[] args) {

        TeacherService teacher = new TeacherService();

        teacher.printBigCollectionOfNumbers();
        teacher.printSmallCollectionOfNumbers();
        teacher.printStudentsCollection();
    }


}
