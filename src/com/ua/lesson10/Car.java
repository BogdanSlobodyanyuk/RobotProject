package src.com.ua.lesson10;

public class Car {

    protected String model;
    protected int yearOfProduction;
    protected Engine typeOfEngine;


    public Car(String model, int yearOfProduction, Engine typeOfEngine) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.typeOfEngine = typeOfEngine;
    }


    public String getTypeOfCar() {

        return "I'm a Car";
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Engine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(Engine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", typeOfEngine=" + typeOfEngine +
                '}';
    }
}
