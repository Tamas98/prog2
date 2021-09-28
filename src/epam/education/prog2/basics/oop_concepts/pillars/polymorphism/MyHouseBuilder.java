package epam.education.prog2.basics.oop_concepts.pillars.polymorphism;

/**
 * TODO docme.
 */
public class MyHouseBuilder extends HouseBuilder {

    public MyHouseBuilder(String companyName) {
        super(companyName);
    }

    @Override
    public void buildHouse() {
        // My house building logic
    }

    @Override
    public void buildHouse(String[] materialList) {
        // Building house from the given material.
    }

    @Override
    public void buildHouse(Long size) {
        // Building house for the given size.
    }
}
