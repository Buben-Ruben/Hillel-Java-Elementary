package InterfacesAndAbstractClasses;

public class Car implements Go, Sound {
    public String type;
    public String model;
    public String color;

    public void info(SportCar sportCar) {
        sportCar.info();
    }
    public void checkName(SportCar sportCar) {
        sportCar.checkName();
    }

    @Override
    public void fast() {
        System.out.println("Fast! Fast! Fast!");
    }

    @Override
    public void makeSound() {
        System.out.println("WRRRRRRRRRRRRRRRRRR");
    }
}

