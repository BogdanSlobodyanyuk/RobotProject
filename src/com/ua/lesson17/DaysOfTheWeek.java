package src.com.ua.lesson17;

public enum DaysOfTheWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNKNOWN_DAY("Week has just 7 days, from 1 to 7");

    private int numberOfDay;
    private String message;

    DaysOfTheWeek(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    DaysOfTheWeek(String message) {
        this.message = message;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public String getMessage() {
        return message;
    }

}
