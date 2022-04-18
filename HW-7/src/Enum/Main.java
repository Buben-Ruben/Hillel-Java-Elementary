package Enum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car cars = Car.PORSCHE;

        System.out.println("\nIs cars an object of class Car?\nAnswer: "+(cars instanceof Car)+"\nIs cars an object of class Enum?\nAnswer: "+(cars instanceof Enum));
        System.out.println("\nCar names: " + Arrays.toString(Car.values()).replaceAll("^\\[|]$","")+"\n");
        System.out.println("Car's description:\n-------------------");

        while (true) {
            switch(cars) {
                case PORSCHE:
                    System.out.println(cars + " is the good car.");
                    cars = Car.BMW;
                    break;
                case BMW:
                    System.out.println(cars + " is the best car!");
                    cars = Car.FORD;
                    break;
                case FORD:
                    System.out.println(cars + " - classic.");
                    cars = Car.TOYOTA;
                    break;
                case TOYOTA:
                    System.out.println(cars + " is not bad, but " + Car.BMW + " is much better.");
                    return;
            }
        }
    }
}
