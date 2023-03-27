package src.com.ua.Lesson22;

import java.util.Comparator;

public class StudentSureNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSureName().compareTo(o2.getSureName());
    }
}
