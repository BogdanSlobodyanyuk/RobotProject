package src.com.ua.lesson16;

public class HomeworkFirstWay implements HomeworkService {


    @Override
    public DaysOfTheWeek findDayOfWeekForNumber(int number) {

        switch (number) {
            case 1 -> {
                return DaysOfTheWeek.MONDAY;
            }
            case 2 -> {
                return DaysOfTheWeek.TUESDAY;
            }
            case 3 -> {
                return DaysOfTheWeek.WEDNESDAY;
            }
            case 4 -> {
                return DaysOfTheWeek.THURSDAY;
            }
            case 5 -> {
                return DaysOfTheWeek.FRIDAY;
            }
            case 6 -> {
                return DaysOfTheWeek.SATURDAY;
            }
            case 7 -> {
                return DaysOfTheWeek.SUNDAY;
            }
            default -> {
                return DaysOfTheWeek.UNKNOWN_DAY;
            }

        }
    }
}
