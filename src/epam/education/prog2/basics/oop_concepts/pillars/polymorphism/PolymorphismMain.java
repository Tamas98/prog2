package epam.education.prog2.basics.oop_concepts.pillars.polymorphism;

/**
 * TODO docme.
 */
public class PolymorphismMain {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new MyHouseBuilder("My house builder company");

        // Overloaded and overridden the buildHouse method.

        houseBuilder.buildHouse();
        houseBuilder.buildHouse(200L);
        houseBuilder.buildHouse(new String[] {"Wood", "Steel"});
    }
}
