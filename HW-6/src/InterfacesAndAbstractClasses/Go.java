package InterfacesAndAbstractClasses;

public interface Go {
    void fast();
    default void slow() {
        System.out.println("So Slow :(");
    }
}
