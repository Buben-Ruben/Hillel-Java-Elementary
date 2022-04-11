package Car;

public class Toyota extends Car{
    private static final String type = "Toyota";
    private String model;
    public void makeSound() {
        System.out.println("WRRRRRRRRRRRRRRR!");
    }
    public String getType() {
        return type;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
