package epam.education.prog2.basics.oop_concepts.pillars.abstraction;

/**
 * TODO docme.
 */
public class MyFriendsHouseBuilderService implements HouseBuilderService {

    @Override
    public void buildHouse() {
        collectMaterials();
        createPlan();
        checkPlanWithCustomer();
        build();
    }

    private void collectMaterials() {
        // Material collecting from our shop.
    }

    private void createPlan() {
        // Creating a build plan.
    }

    private void checkPlanWithCustomer() {
        // Checking the plan with the customer.
    }

    private void build() {
        // Building house.
    }
}
