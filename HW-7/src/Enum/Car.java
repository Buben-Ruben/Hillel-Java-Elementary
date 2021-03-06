package Enum;

public enum Car {
    PORSCHE("Porsche"),
    BMW("BMW"),
    FORD("Ford"),
    TOYOTA("Toyota");

    private final String name;
    Car (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
