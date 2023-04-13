package src.com.ua.Lesson26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {

            System.out.println("Your number in square is: " + raiseNumberInSquare());

        } catch (LessThanZeroException e) {
            System.out.println("Method cannot use the number what is less then zero");
        }

    }

    public static int raiseNumberInSquare() throws LessThanZeroException {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.println("Enter your number to rise in square: ");

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("You didn't enter integer type, try again");
                scanner.next();
            }
        }

        if (number < 0) {
            throw new LessThanZeroException();
        } else {
            return number * number;
        }
    }
}
