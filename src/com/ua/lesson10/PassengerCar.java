package src.com.ua.lesson10;

public class PassengerCar extends Car {

    protected boolean isChildChair;
    protected boolean isOpenedRoof;

    public PassengerCar(String model, int yearOfProduction, Engine typeOfEngine, boolean isChildChair, boolean isOpenedRoof) {
        super(model, yearOfProduction, typeOfEngine);
        this.isChildChair = isChildChair;
        this.isOpenedRoof = isOpenedRoof;
    }


    @Override
    public String getTypeOfCar() {

        return "I'm a Passenger Car";
    }


    public boolean getIsChildChair() {
        return isChildChair;
    }

    public void setChildChair(boolean childChair) {
        isChildChair = childChair;
    }

    public boolean getIsOpenedRoof() {
        return isOpenedRoof;
    }

    public void setOpenedRoof(boolean openedRoof) {
        isOpenedRoof = openedRoof;
    }


    @Override
    public String toString() {
        return "Renault{" +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", typeOfEngine=" + typeOfEngine +
                "isChildChair=" + isChildChair +
                ", isOpenedRoof=" + isOpenedRoof +
                '}';
    }
}
