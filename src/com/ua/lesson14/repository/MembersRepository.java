package src.com.ua.lesson14.repository;

import src.com.ua.lesson14.domain.Student;
import src.com.ua.lesson14.domain.Teacher;

public interface MembersRepository {

    void saveMembersInArray(Student student);
    Student[] findAllStudents();

    Teacher[] findAllTeachers();





}
