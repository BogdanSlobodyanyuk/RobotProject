package src.com.ua.lesson14Work.domain;

public class Student extends MemberOfUniversity {

    private double averageScore;
    private String studentGroup;

    private int numberOfStudent;


    public Student() {
    }

    public Student(String firstName, String secondName, int age, String id, double averageScore, String studentGroup) {
        super(firstName, secondName, age, id);
        this.averageScore = averageScore;
        this.studentGroup = studentGroup;
    }


    @Override
    public void determinePersonality() {
        System.out.println("\n" + "There are Students");
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }


    @Override
    public String toString() {
        return "Student{" +
                "averageScore=" + averageScore +
                ", studentGroup='" + studentGroup + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
