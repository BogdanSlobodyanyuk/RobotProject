package src.com.ua.lesson15;

public abstract class Human{

   private String name;
   private String secondName;


   public Human(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return name + " " + secondName ;
    }

    public abstract void getMe ();
}
