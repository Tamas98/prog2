package epam.education.prog2.basics.oop_concepts.pillars.inheritance;

/**
 * TODO docme.
 */
public class MyHouseBuildingService extends DefaultHouseBuilderService implements HouseBuilderService, BaseBuilderService {

    // As you can see, we can inherit from multiple interfaces, but our class
    // can only extend one class. Feel free to add FamilyHouseBuilderService
    // after the extends. The IntelliJ will show you an error, that says multiple
    // superclasses are not allowed.

    @Override
    public void createBuildPlan() {

    }

    @Override
    public void buildHouse() {

    }

    @Override
    public void buildBase() {

    }

}
