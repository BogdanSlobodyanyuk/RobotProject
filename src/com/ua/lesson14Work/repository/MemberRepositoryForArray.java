package src.com.ua.lesson14Work.repository;

import src.com.ua.lesson14Work.domain.Student;
import src.com.ua.lesson14Work.domain.Teacher;

public interface MemberRepositoryForArray {

    void saveMembersInArray(Student student);

    void saveMembersInArray(Teacher teacher);

    Student[] findAllStudents();

    Teacher[] findAllTeachers();

}
