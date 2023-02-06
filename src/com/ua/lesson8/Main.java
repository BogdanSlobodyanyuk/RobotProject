package src.com.ua.lesson8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] userArray = new int[10];

        inputUserArrayData(userArray);
        outputUserArrayData(userArray);


    }

    static void inputUserArrayData(int[] userArray) {

        System.out.println("You can get 10 random numbers just chose minimum and maximum value of them. ");

        Scanner userScanner = new Scanner(System.in);

        System.out.println("Enter minimum value of random numbers: ");
        int minValueOfRandomNumber = userScanner.nextInt();

        System.out.println("Enter maximum value of random numbers: ");
        int maxValueOfRandomNumber = userScanner.nextInt();

        fillArrayWithRandomNumbers(userArray, minValueOfRandomNumber, maxValueOfRandomNumber);

    }

    static void outputUserArrayData(int[] userArray) {

        System.out.print("Your 10 random numbers are: ");
        printUserArray(userArray);

        System.out.println("Your minimum number of 10 random numbers is: " + getMinValueOfUserArrayNumbers(userArray));
        System.out.println("Your maximum number of 10 random numbers is: " + getMaxValueOfUserArrayNumbers(userArray));
        System.out.println("Your average value of 10 random numbers is: " + getAverageValueOfUserArrayNumbers(userArray));
        System.out.println("Your sum of 10 random numbers is: " + getSumValueOfAllUserArrayNumbers(userArray));

    }

    static void fillArrayWithRandomNumbers(int[] userArray, int minValueOfRandomNumber, int maxValueOfRandomNumber) {

        Random random = new Random();
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = random.nextInt(minValueOfRandomNumber, maxValueOfRandomNumber);
        }
    }

    static void printUserArray(int[] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            if (i == userArray.length - 1) {
                System.out.print(userArray[i]);
            } else {
                System.out.print(userArray[i] + " , ");
            }
        }
        System.out.println();
    }

//    static int[] sortUserArrayByBubble(int[] userArray) {
//
//        for (int i = 0; i < userArray.length; i++) {
//            for (int j = i + 1; j < userArray.length; j++) {
//                if (userArray[i] > userArray[j]) {
//                    int temp = userArray[i];
//                    userArray[i] = userArray[j];
//                    userArray[j] = temp;
//                }
//            }
//        }
//        return userArray;
//    }

    static int getMinValueOfUserArrayNumbers(int[] userArray) {

        int min = userArray[0];
        for (int i = 1; i < userArray.length; i++) {
            if (userArray[i] < min) {
                min = userArray[i];
            }
        }

        return min;
    }

    static int getMaxValueOfUserArrayNumbers(int[] userArray) {

        int max = userArray[0];
        for (int i = 1; i < userArray.length; i++) {
            if (userArray[i] > max) {
                max = userArray[i];
            }
        }

        return max;
    }

    static double getAverageValueOfUserArrayNumbers(int[] userArray) {

        double sumOfUserArray = 0.0d;

        for (int i = 0; i < userArray.length; i++) {
            sumOfUserArray += userArray[i];
        }

        double averageOfUserArray = sumOfUserArray / userArray.length;

        return averageOfUserArray;
    }

    static int getSumValueOfAllUserArrayNumbers(int[] userArray) {

        int sumValue = 0;

        for (int i = 0; i < userArray.length; i++) {
            sumValue += userArray[i];
        }

        return sumValue;
    }
}
