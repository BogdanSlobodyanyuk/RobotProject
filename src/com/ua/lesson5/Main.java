package src.com.ua.lesson5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int evenNumber;
        int barryAge;
        int tomasAge;
        int luckNumber;


        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Check if your number is even: ");
        evenNumber = scanner.nextInt();
        System.out.print("\n" + "Enter age of Barry: ");
        barryAge = scanner.nextInt();
        System.out.print("\n" + "Enter age of Tomas: ");
        tomasAge = scanner.nextInt();
        System.out.print("\n" + "Enter your luck number from 1 to 3: ");
        luckNumber = scanner.nextInt();


        if (evenNumber % 2 == 0 & evenNumber != 0) {
            System.out.println("Your number is even");
        } else System.out.println("You entered number is not even");


        if (tomasAge >= 1 & barryAge >= 1) {
            if (tomasAge > barryAge) {
                System.out.println("Tomas is older ");
            } else if (barryAge > tomasAge) {
                System.out.println("Barry is older");
            } else if (tomasAge == barryAge) {                               // I can write just "else" but "else if" looks more comfortable to read
                System.out.println("Tomas and Barry have the same age");
            }
        } else {
            System.out.println("You entered incorrect age");
        }


        switch (luckNumber) {
            case 1 -> System.out.println("You won 10000$, you're lucky one");
            case 2 -> System.out.println("You won a new car, drive careful");
            case 3 -> System.out.println("You won a new Iphone 14, time to be a blogger");
            default -> System.out.println("Sorry, but you won nothing");
        }


    }
}
