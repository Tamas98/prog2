package epam.education.prog2.basics.oop_concepts.pillars.polymorphism;

/**
 * TODO docme.
 */
public abstract class HouseBuilder {

    private String companyName;

    public HouseBuilder(String companyName) {
        this.companyName = companyName;
    }

    // Overloading
    public void buildHouse() {
        // House building logic
    }

    public abstract void buildHouse(String[] materialList);
    public abstract void buildHouse(Long size);
}
