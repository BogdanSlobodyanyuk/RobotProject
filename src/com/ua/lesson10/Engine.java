package src.com.ua.lesson10;

public enum Engine {
    Disel1("Disel \"Duratec\" 1,99 L"),
    Disel2("Disel \"Ecotec\" 2,39 L"),
    Petrol1("Petrol \"Skytec\" 1,99 L"),
    PETROL2("Petrol \"Skytec\" 2,5 L");

    private final String type;

    Engine(String type) {
        this.type = type;
    }

    public String toString() {
        return this.type;
    }
}
