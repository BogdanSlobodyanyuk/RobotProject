package src.com.ua.lesson11;

public class PassangerCar extends Car {


    static {
        System.out.println("Static initialization block of Sub Class " + 2);
    }

    {
        System.out.println("Simple initialization block of Sub Class " + 5);
    }

    public PassangerCar() {

        System.out.println("Constructor of Sub Class " + 6);

    }


}
