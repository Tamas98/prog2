package epam.education.prog2.enums_and_generics.generics.exercises;

/**
 * TODO docme.
 */
public class Car {
    private String name;
    private int topSpeed;

    public Car(String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
