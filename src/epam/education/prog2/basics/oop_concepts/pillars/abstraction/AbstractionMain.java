package epam.education.prog2.basics.oop_concepts.pillars.abstraction;

/**
 * TODO docme.
 */
public class AbstractionMain {
    public static void main(String[] args) {
        HouseBuilderService houseBuilderService = new MyHouseBuilderService();
        HouseBuilderService friendsHouseBuilderService = new MyFriendsHouseBuilderService();

        // As I mentioned during the presentation, the user only sees
        // that the service can build a house. It don't know how they will do it
        // and it doesn't need to know the hidden logic. Only that there is an chance
        // to build a house. The two service can be swapped, the result must be the same
        // only the underlying process changes. In the end the user will have a house and that's
        // what matters.

        houseBuilderService.buildHouse();
        friendsHouseBuilderService.buildHouse();
    }
}
