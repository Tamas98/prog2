package epam.education.prog2.basics.oop_concepts.pillars.abstraction;

/**
 * TODO docme.
 */
public class MyHouseBuilderService implements HouseBuilderService {

    @Override
    public void buildHouse() {
        orderMaterial();
        buildBase();
        buildStructure();
        buildRoof();
    }

    private void orderMaterial() {
        // material ordering logic
    }

    private void buildBase() {
        // base building logic
    }

    private void buildStructure() {
        // structure building logic
    }

    private void buildRoof() {
        // roof building logic
    }
}
