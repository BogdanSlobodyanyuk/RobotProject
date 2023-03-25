package src.com.ua.lesson17;

public class HomeworkSecondWay implements HomeworkService {
    @Override
    public DaysOfTheWeek findDayOfWeekForNumber(int number) {

        DaysOfTheWeek[] arrayOfDays = DaysOfTheWeek.values();
        DaysOfTheWeek day = DaysOfTheWeek.UNKNOWN_DAY;
        for (int i = 0; i < arrayOfDays.length - 1; i++) {
            if (arrayOfDays[i].getNumberOfDay() == number) {
                day = arrayOfDays[i];
                return day;
            }
        }
        return day;
    }
}
