package src.com.ua.lesson16;

public class HomeworkThirdWay implements HomeworkService {
    @Override
    public DaysOfTheWeek findDayOfWeekForNumber(int number) {

        DaysOfTheWeek result = DaysOfTheWeek.UNKNOWN_DAY;

        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            if (day.ordinal() + 1 == number) {
                result = day;
            }
        }

        return result;
    }
}

