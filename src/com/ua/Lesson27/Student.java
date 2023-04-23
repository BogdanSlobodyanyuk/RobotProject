package src.com.ua.Lesson27;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {


    @Serial
    private static final long serialVersionUID = -6301996741246328908L;
    private String name;

    private transient int age;

    private String group;


    public Student() {
    }

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }
}
