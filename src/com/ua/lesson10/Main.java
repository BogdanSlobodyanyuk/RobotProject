package src.com.ua.lesson10;

public class Main {
    public static void main(String[] args) {

        PassengerCar renault = new PassengerCar("Megan", 2005, Engine.PETROL2, true, false);
        System.out.println("\n" + renault + "\n" + renault.getTypeOfCar() + "\n");

        TruckCar mercedes = new TruckCar("Sprinter", 2009, Engine.Disel1, true, false);
        System.out.println(mercedes + "\n" +mercedes.getTypeOfCar());




    }
}
