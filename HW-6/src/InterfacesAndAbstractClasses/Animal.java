package InterfacesAndAbstractClasses;

public class Animal implements Go, Sound{
    @Override
    public void fast() {
        System.out.println("The animal runs fast.");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof! Meow! Mooooo!");
    }
}
