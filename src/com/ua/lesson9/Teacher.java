package src.com.ua.lesson9;

public class Teacher {
    private final String firstName;
    private final String secondName;
    private final int age;
    private final int id;
    private final boolean isTeachingNow;


    public Teacher(String firstName, String secondName, int age, int id, boolean isTeachingNow) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.id = id;
        this.isTeachingNow = isTeachingNow;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName = '" + firstName + '\'' +
                ", secondName = '" + secondName + '\'' +
                ", age = " + age +
                ", id = " + id +
                ", isTeachingNow = " + isTeachingNow +
                '}';
    }
}
