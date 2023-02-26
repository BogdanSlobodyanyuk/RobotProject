package src.com.ua.lesson14.domain;

public class Teacher extends MembersOfUniversity {

    private int numberOfWorksHours;
    private int salary;
    private int numberOfTeacher;

    public Teacher() {
    }


    public Teacher(String firstName, String secondName, int age, String id, int numberOfWorksHours, int salary) {
        super(firstName, secondName, age, id);
        this.numberOfWorksHours = numberOfWorksHours;
        this.salary = salary;
    }

    @Override
    public void determinePersonality() {
        System.out.println("\n" + "There are Teachers");
    }


    public int getNumberOfWorksHours() {
        return numberOfWorksHours;
    }

    public void setNumberOfWorksHours(int numberOfWorksHours) {
        this.numberOfWorksHours = numberOfWorksHours;
    }

    public int getNumberOfTeacher() {
        return numberOfTeacher;
    }

    public void setNumberOfTeacher(int numberOfTeacher) {
        this.numberOfTeacher = numberOfTeacher;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "numberOfWorksHours=" + numberOfWorksHours +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
