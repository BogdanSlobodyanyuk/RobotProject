package src.com.ua.lesson15;

public class Main {
    public static void main(String[] args) {

        Driveable driver = new Driver("Bohdan", "Nestorenko");
        Flyeable pilot = new Pilot("Denis","Petrenko");

        System.out.println(driver + " always " + driver.drive().concat("s"));
        System.out.println(pilot + " always " + pilot.fly().replace("y","ies"));
    }
}
