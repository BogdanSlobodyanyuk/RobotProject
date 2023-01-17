package src.com.ua.lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int a;
        int b;


        /* I decided to use scanner in my program to let user input own numbers */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer variable: ");
        a = scanner.nextInt();
        System.out.print("Enter second integer variable: ");
        b = scanner.nextInt();


        int addition = a + b;
        int subtraction = a - b;
        double division = (double) a / (double) b; // For division, I used type double because sometimes result cannot be an integer type
        int multiplication = a * b;

        System.out.println("\n" + "addition: " + addition + "\n" + "subtraction: " + subtraction + "\n" + "division: " + division + "\n" + "multiplication: " + multiplication);


    }
}
