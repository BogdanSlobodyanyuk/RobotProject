package src.com.ua.lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        printAllStudentAndTeachers();
        printRandomArray();

    }

    static void printAllStudentAndTeachers() {

        System.out.println("\n" + "People in University: ");

        Student studentStepan = new Student("Stepan", "Sloboda", 25, 775423, false);
        Student studentDemian = new Student("Demian", "Fedak", 22, 432423, true);
        Teacher teacherMariya = new Teacher("Mariya", "Virastuk", 45, 776543, false);
        Teacher teacherOlha = new Teacher("Oleha", "Nesteruk", 32, 777643, true);

        System.out.println(studentStepan + "\n" + studentDemian + "\n" + teacherMariya + "\n" + teacherOlha + "\n");
    }

    static void printRandomArray (){

        System.out.println("You can get random array of integer numbers ");

        Scanner userScanner = new Scanner(System.in);

        System.out.println("Enter length of your array : ");
        int lengthOfRandomArray = userScanner.nextInt();

        System.out.println("Enter minimum value of random array: ");
        int minValueOfRandomNumber = userScanner.nextInt();

        System.out.println("Enter maximum value of random array: ");
        int maxValueOfRandomNumber = userScanner.nextInt();


        ArrayChanger randomUserArray = new ArrayChanger();

        System.out.println("\n"+"Your random array: ");
        int[] userRandomArray = randomUserArray.createArray(lengthOfRandomArray, minValueOfRandomNumber, maxValueOfRandomNumber);
        randomUserArray.printArray(userRandomArray);

        System.out.println("Your array what starts from higher to lower number: ");
       int[] sortedUserArrayFromLowerToHigher = randomUserArray.sortArrayInDecreasingSide(userRandomArray);
        randomUserArray.printArray(sortedUserArrayFromLowerToHigher);

        System.out.println("Your array what starts from lower to higher number: ");
        int[] sortedUserArrayFromHigherToLower = randomUserArray.sortArrayInIncreasingSide(userRandomArray);
        randomUserArray.printArray(sortedUserArrayFromHigherToLower);

    }
}
