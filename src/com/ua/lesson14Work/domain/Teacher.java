package src.com.ua.lesson14Work.domain;

public class Teacher extends MemberOfUniversity {

    private int numberOfWorksHours;
    private int salary;
    private int numberOfTeacher;
    private TaxType typeOfEmploee;
    public Teacher() {
    }

    public Teacher(String firstName, String secondName, int age, String id, int numberOfWorksHours, int salary, TaxType typeOfEmploee) {
        super(firstName, secondName, age, id);
        this.numberOfWorksHours = numberOfWorksHours;
        this.salary = salary;
        this.typeOfEmploee = typeOfEmploee;
    }

    @Override
    public void determinePersonality() {
        System.out.println("\n" + "There are Teachers");
    }


    public TaxType getTypeOfEmploee() {
        return typeOfEmploee;
    }

    public void setTypeOfEmploee(TaxType typeOfEmploee) {
        this.typeOfEmploee = typeOfEmploee;
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
