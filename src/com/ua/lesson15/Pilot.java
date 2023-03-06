package src.com.ua.lesson15;

public class Pilot extends Human implements Flyeable {


    public Pilot(String name, String secondName) {
        super(name, secondName);
    }

    @Override
    public void getMe() {

    }

    @Override
    public String fly() {
        return "fly";
    }

}
