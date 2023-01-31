package src.com.ua.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1CubeNumber();
        task2StarsInLine();
        task3BuildPyramid();

    }

    static void task1CubeNumber() {

        Scanner userScanner = new Scanner(System.in);

        System.out.println("Enter your number to rise into a cube power: ");
        int userEnteredNumber = userScanner.nextInt();

        System.out.println("Cube power of " + userEnteredNumber + ": " + raiseNumberIntoCubePower(userEnteredNumber));

    }

    static void task2StarsInLine() {

        Scanner userScanner = new Scanner(System.in);

        System.out.println("\n" + "Enter your numbers of stars");
        int userStarsNumber = userScanner.nextInt();

        System.out.print("Here are your stars: ");
        printStarsInLine(userStarsNumber);

    }

    static void task3BuildPyramid() {

        Scanner userScanner = new Scanner(System.in);

        System.out.println("\n" + "\n" + "You can build your pyramid just choose a number of layers: ");
        int userLayerOfPyramid = userScanner.nextInt();

        System.out.println("Enter a symbol witch makes your pyramid. It can be \"*\",\"!\",\"$\" or write your own symbol:   ");
        String userPyramidSymbol = userScanner.next();


        System.out.println("Your pyramid is below : " + "\n");

        switch (userPyramidSymbol) {
            case ("*") -> printSymbolInPyramid(userLayerOfPyramid);
            case ("!") -> printSymbolInPyramid(userLayerOfPyramid, "!");
            case ("$") -> printSymbolInPyramid(userLayerOfPyramid, "$");
            default -> printSymbolInPyramid(userLayerOfPyramid, userPyramidSymbol);
        }
    }


    static int raiseNumberIntoCubePower(int userInputNumber) {

        userInputNumber *= userInputNumber * userInputNumber;

        return userInputNumber;
    }

    static void printStarsInLine(int userSelectedNumber) {
        for (int i = 1; i <= userSelectedNumber; i++) {
            System.out.print("*");
        }
    }

    static void printSymbolInPyramid(int userLayersOfPyramid) {

        String userSymbol = "*";

        for (int i = 0; i <= userLayersOfPyramid; i++) {
            System.out.print(userSymbol);
            userSymbol += "*";
        }
    }

    static void printSymbolInPyramid(int userLayerOfPyramid, String userPyramidSymbol) {

        String theSameSymbol = userPyramidSymbol;

        for (int i = 1; i <= userLayerOfPyramid; i++) {
            System.out.println(userPyramidSymbol);
            userPyramidSymbol += theSameSymbol;

        }
    }
}
