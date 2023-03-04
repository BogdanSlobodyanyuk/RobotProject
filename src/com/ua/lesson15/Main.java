package src.com.ua.lesson15;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver("Bohdan", "Nestorenko");
        Pilot pilot = new Pilot("Denis","Petrenko");

        System.out.println(driver + " always " + driver.drive().concat("s"));
        System.out.println(pilot + " always " + pilot.fly().replace("y","ies"));
    }
}
