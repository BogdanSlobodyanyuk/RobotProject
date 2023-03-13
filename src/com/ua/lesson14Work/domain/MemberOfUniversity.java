package src.com.ua.lesson14Work.domain;

public abstract class MemberOfUniversity {

    protected String firstName;
    protected String secondName;

    protected int age;
    protected String id;


    public MemberOfUniversity() {
    }

    public MemberOfUniversity(String firstName, String secondName, int age, String id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.id = id;
    }


    public abstract void determinePersonality();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "MembersOfUniversity{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
