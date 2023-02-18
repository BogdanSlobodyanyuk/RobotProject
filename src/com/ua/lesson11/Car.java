package src.com.ua.lesson11;

public class Car {

    private static int numbersOfExteriorMirrorsInCar = 2;
    private static int numbersOfPedalsInManualBoxGears = 3;
    private static int numbersOfPedalsInAutomaticBoxGears = 2;


    static {
        System.out.println("Static initialization block of Super Class " + 1);
    }

    {
        System.out.println("Simple initialization block of Super Class " + 3);
    }


    public Car() {
        System.out.println("Constructor of Super Class " + 4);
    }


    public static int getNumbersOfExteriorMirrorsInCar() {
        return numbersOfExteriorMirrorsInCar;
    }

    public static void setNumbersOfExteriorMirrorsInCar(int numbersOfExteriorMirrorsInCar) {
        Car.numbersOfExteriorMirrorsInCar = numbersOfExteriorMirrorsInCar;
    }

    public static int getNumbersOfPedalsInManualBoxGears() {
        return numbersOfPedalsInManualBoxGears;
    }

    public static void setNumbersOfPedalsInManualBoxGears(int numbersOfPedalsInManualBoxGears) {
        Car.numbersOfPedalsInManualBoxGears = numbersOfPedalsInManualBoxGears;
    }

    public static int getNumbersOfPedalsInAutomaticBoxGears() {
        return numbersOfPedalsInAutomaticBoxGears;
    }

    public static void setNumbersOfPedalsInAutomaticBoxGears(int numbersOfPedalsInAutomaticBoxGears) {
        Car.numbersOfPedalsInAutomaticBoxGears = numbersOfPedalsInAutomaticBoxGears;
    }

    public static String checkNumbersOfPedals(int numbersOfPedalsInManualBoxGears, int numbersOfPedalsInAutomaticBoxGears) {

        String resultManualBoxOfGears = "If you want to drive Car with manual box gears you should know how to use " + numbersOfPedalsInManualBoxGears + " pedals" + "\n";
        String resultAutomaticBoxOfGears = "If you want to drive Car with automatic box gears you should know how to use " + numbersOfPedalsInAutomaticBoxGears + " pedals";

        return resultManualBoxOfGears + resultAutomaticBoxOfGears;

    }

}
