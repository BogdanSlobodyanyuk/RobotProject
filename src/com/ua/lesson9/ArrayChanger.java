package src.com.ua.lesson9;

import java.util.Random;

public class ArrayChanger {

    public int[] createArray(int arrayLenght, int minValueOfRandomNumber, int maxValueOfRandomNumber) {

        int[] userArray = new int[arrayLenght];

        Random random = new Random();
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = random.nextInt(minValueOfRandomNumber, maxValueOfRandomNumber);
        }


        return userArray;
    }

    public int[] sortArrayInIncreasingSide(int[] userArray) {


        for (int i = 0; i < userArray.length; i++) {
            for (int j = i + 1; j < userArray.length; j++) {
                if (userArray[i] > userArray[j]) {
                    int temp = userArray[i];
                    userArray[i] = userArray[j];
                    userArray[j] = temp;
                }
            }
        }

        return userArray;

    }


    public int[] sortArrayInDecreasingSide(int[] userArray) {

        for (int i = 0; i < userArray.length; i++) {
            for (int j = i + 1; j < userArray.length; j++) {
                if (userArray[i] < userArray[j]) {
                    int temp = userArray[i];
                    userArray[i] = userArray[j];
                    userArray[j] = temp;
                }
            }
        }

        return userArray;
    }

    public void printArray(int[] userArray) {

        for (int j : userArray) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }


}
