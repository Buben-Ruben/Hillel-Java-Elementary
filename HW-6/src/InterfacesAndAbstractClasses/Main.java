package InterfacesAndAbstractClasses;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();                                                //
        SportCar[] sportCars = {new Porsche(),new BMW(),new Ford()};        //
        for (int i = 0; i < sportCars.length; i++) {                        //
            car.info(sportCars[i]);                                         // Implementation of the abstract sportCar() class
            System.out.print("\t[Car Class] - ");                           //
            car.checkName(sportCars[i]);                                    //
        }                                                                   //

        Go car1 = new Car();                                                //
        Go animal = new Animal();                                           // Interfaces
        Sound car2 = new Car();                                             //
        Sound animal1 = new Animal();                                       //

        System.out.print("\nInterface Go for Car:\t\t");
        car1.fast();
        System.out.print("Interface Sound for Car:\t");
        car2.makeSound();
        System.out.print("Interface Go for Animal:\t");
        animal.fast();
        System.out.print("Interface Sound for Animal:\t");
        animal1.makeSound();
    }
}
