package src.com.ua.lesson10;

public class TruckCar extends Car {


    protected boolean isLightReflector;
    protected boolean isFoldingTrunk;

    public TruckCar(String model, int yearOfProduction, Engine typeOfEngine, boolean isLightReflector, boolean isFoldingTrunk) {
        super(model, yearOfProduction, typeOfEngine);
        this.isLightReflector = isLightReflector;
        this.isFoldingTrunk = isFoldingTrunk;
    }


    @Override
    public String getTypeOfCar() {

        return "I'm a Truck Car";
    }


    public boolean getIsLightReflector() {
        return isLightReflector;
    }

    public void setLightReflector(boolean lightReflector) {
        isLightReflector = lightReflector;
    }

    public boolean getIsFoldingTrunk() {
        return isFoldingTrunk;
    }

    public void setFoldingTrunk(boolean foldingTrunk) {
        isFoldingTrunk = foldingTrunk;
    }


    @Override
    public String toString() {
        return "Mercedes{" +
                "isLightReflector=" + isLightReflector +
                ", isFoldingTrunk=" + isFoldingTrunk +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", typeOfEngine=" + typeOfEngine +
                '}';
    }
}
