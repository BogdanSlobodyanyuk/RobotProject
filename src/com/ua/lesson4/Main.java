package src.com.ua.lesson4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* This program help user to create own driver code for driver license
        The correct driver code includes user's name + underscore ('_') + user's surename + colon (':') +
         user's code (first and last letter of name + hyphen ('-') + first and last letter of surename).
         Everything has to be in Upper Case without any Gaps!  */

        String userName;
        String userSurename;


        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Enter your Name: ");
        userName = scanner.nextLine().replace(" ", "");
        System.out.println("\n" + "Enter your Surename: ");
        userSurename = scanner.nextLine().replace(" ", "");


        String userCode = userName.charAt(0) + "" + userName.charAt(userName.length() - 1)
                + "-" + userSurename.charAt(0) + "" + userSurename.charAt(userSurename.length() - 1);

        String wrongUserData = (userName + ":" + userSurename + "_" + userCode).toLowerCase();
        String correctUserData = (userName + "_" + userSurename + ":" + userCode).toUpperCase();


        System.out.println("Wrong way to write down your data: " + wrongUserData + "\n"
                + "Correct way to write down your data: " + correctUserData);


    }
}
