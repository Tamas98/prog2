package epam.education.prog2.basics.oop_concepts.classes_and_objects;

//Class
public class Car {
    // State
    private String name;
    private String type;
    private String brand;
    private int topSpeed;
    private int fuelConsumption;

    // Constructor
    public Car(String name, String type, String brand, int topSpeed, int fuelConsumption) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.topSpeed = topSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public Car() {
    }

    //Behavior
    public void drive() {
        System.out.println(String.format("I am driving my %s %s %s car", brand, name, type));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
