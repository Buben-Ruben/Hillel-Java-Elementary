package InterfacesAndAbstractClasses;

public abstract class SportCar {
    public abstract void info();
    public void checkName() {
        System.out.println(getClass().getName());
    }
}
class Porsche extends SportCar{
    @Override
    public void info() {
        System.out.print("Sport Car Porsche\t");
    }
}
class BMW extends SportCar{
    @Override
    public void info() {
        System.out.print("Sport Car BMW M4\t");
    }
}
class Ford extends SportCar{
    @Override
    public void info() {
        System.out.print("Sport Car Ford Mustang");
    }
}
