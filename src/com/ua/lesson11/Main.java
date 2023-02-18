package src.com.ua.lesson11;

public class Main {
    public static void main(String[] args) {

        PassangerCar numberCar = new PassangerCar();

        System.out.println("\n" + "I don't like when my exterior mirrors are too wet, I'd like to buy watter resistance stickers. How many stickers I need to buy ? ");
        System.out.println("As you know, every car has " + Car.getNumbersOfExteriorMirrorsInCar() + " exteriors mirrors, so buy " + Car.getNumbersOfExteriorMirrorsInCar() + " stickers");

        System.out.println("\n" + "I'd like to check, how many pedals should I have to know to drive a car ?");
        System.out.println(Car.checkNumbersOfPedals(Car.getNumbersOfPedalsInManualBoxGears(), Car.getNumbersOfPedalsInAutomaticBoxGears()));


    }
}
