package src.com.ua.lesson17;

import java.util.Scanner;

public interface HomeworkService {

    DaysOfTheWeek findDayOfWeekForNumber(int number);

    default void printDayOfWeekForNumber(int number) {
        if (findDayOfWeekForNumber(number) == DaysOfTheWeek.UNKNOWN_DAY) {
            System.out.println(DaysOfTheWeek.UNKNOWN_DAY.getMessage());
        } else {
            System.out.println(findDayOfWeekForNumber(number));
        }
    }

    default void checkHomework() {
        System.out.println("Please enter a number of a day:");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        System.out.println("Your day is: ");
        printDayOfWeekForNumber(b);

    }
}

