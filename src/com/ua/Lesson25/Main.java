package src.com.ua.Lesson25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        checkerWithException();
        checkerWithValidation();

    }

    public static void checkerWithException() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        System.out.println("Program finished");
    }

    public static void checkerWithValidation() {
        Scanner scanner = new Scanner(System.in);
        boolean isEnteredNumber = false;

        while (!isEnteredNumber) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                isEnteredNumber = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        System.out.println("Program finished");
    }
}
