package epam.education.prog2.basics.oop_concepts.classes_and_objects;

/**
 * TODO docme.
 */
public class ClassesAndObjectsExample {
    public static void main(String[] args) {
        // Objects
        Car myCar = new Car("Best","Sport","Ferrari", 365, 15);
        Car myEmptyCar = new Car();

        myCar.drive();
        myEmptyCar.drive();
    }
}
