package Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        var sc = new Scanner(System.in);
        String command = "new";
        String type;
        String model;
        String setColor;
        int setSpeed;
        int setFuel;
        System.out.print("\nMain Menu\n");
        while (command!=null){
            switch (command) {
                case "help":
                    car.help();
                    command = "null";
                    break;
                case "new":
                    System.out.print("\nEnter the make of the car: ");
                    type = sc.nextLine();
                    System.out.print("Enter " + type + "'s model: ");
                    model = sc.nextLine();
                    System.out.print("Enter the color of car: ");
                    setColor = sc.nextLine();
                    car = new Car(type, model, setColor);
                    command = "null";
                    break;
                case "color":
                    System.out.print("\nEnter the color you want to set: ");
                    setColor = sc.nextLine();
                    car.setColor(setColor);
                    command = "null";
                    break;
                case "fuel":
                    System.out.print("\nEnter the amount of fuel you want to add: ");
                    setFuel = sc.nextInt();
                    car.setFuel(setFuel);
                    command = "null";
                    break;
                case "speed":
                    System.out.print("\nEnter how much to increase/decrease the speed of the car: ");
                    setSpeed = sc.nextInt();
                    car.setSpeed(setSpeed);
                    command = "null";
                    break;
                case "info":
                    System.out.println(car.carInfoToString());
                    command = "null";
                    break;
                case "exit":
                    System.exit(0);
                    return;
                default:
                    System.out.print("\nEnter the command (type [help] to see a list of commands): ");
                    command = sc.nextLine();
                    break;
            }
        }
    }
}
