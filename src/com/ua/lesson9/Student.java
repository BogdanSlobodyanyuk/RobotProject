package src.com.ua.lesson9;

public class Student {
    private final String firstName;
    private final String secondName;
    private final int age;
    private final int id;
    private final boolean isStudyingNow;

    public Student(String firstName, String secondName, int age, int id, boolean isStudyingNow) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.id = id;
        this.isStudyingNow = isStudyingNow;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName = '" + firstName + '\'' +
                ", secondName = '" + secondName + '\'' +
                ", age = " + age +
                ", id = " + id +
                ", isStudyingNow = " + isStudyingNow +
                '}';
    }
}
