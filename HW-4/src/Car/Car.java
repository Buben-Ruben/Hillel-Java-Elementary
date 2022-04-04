package Car;

public class Car {

    private String type;
    private String model;
    private String color;
    private int speed;
    private int fuel;

    public Car() {
    }
    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public void Speed(int argument) {
        if (argument > 0) {
            speed += argument;
        } else {
            speed -= argument;
        }
    }

    public String carInfoToString() {
        return "\nCar Info [type=" + type + ", model=" + model + ", color=" + color + ", speed=" + speed + ", fuel=" + fuel +"]";
    }

    public void help() {
        System.out.println("""
                |\t[new]\t\t- to create new car
                |\t[color]\t- to set car's color
                |\t[fuel]\t- to set the amount of fuel
                |\t[speed]\t\t- to increase/decrease car speed
                |\t[info]\t- get car info
                |\t[exit]\t\t- close program""");
    }
}
