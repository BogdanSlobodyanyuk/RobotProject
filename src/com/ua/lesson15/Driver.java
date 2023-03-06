package src.com.ua.lesson15;

public class Driver extends Human implements Driveable{

    public Driver(String name, String secondName) {
        super(name, secondName);
    }

    @Override
    public void getMe() {
        System.out.println("look");
    }


    @Override
    public String drive() {
        return "drive";
    }

}
