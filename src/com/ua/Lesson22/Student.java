package src.com.ua.Lesson22;

public class Student {

    private final String sureName;
    private final Double averageRate;

    public Student(String sureName, Double averageRate) {
        this.sureName = sureName;
        this.averageRate = averageRate;
    }

    public String getSureName() {
        return sureName;
    }

    public Double getAverageRate() {
        return averageRate;
    }

    @Override
    public String toString() {
        return  "(" + sureName + "->" +
                "averageRate: " + averageRate +
                ")";
    }
}
