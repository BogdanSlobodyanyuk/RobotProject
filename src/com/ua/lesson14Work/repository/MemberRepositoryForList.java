package src.com.ua.lesson14Work.repository;

import src.com.ua.lesson14Work.domain.Student;
import src.com.ua.lesson14Work.domain.Teacher;

import java.util.List;

public interface MemberRepositoryForList {

    void saveMembersInList(Student student);

    void saveMembersInList(Teacher teacher);

    List<Student> findAllStudents();

    List<Teacher> findAllTeachers();
}
