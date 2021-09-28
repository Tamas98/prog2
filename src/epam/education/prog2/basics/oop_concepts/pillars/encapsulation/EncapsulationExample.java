package epam.education.prog2.basics.oop_concepts.pillars.encapsulation;

/**
 * TODO docme.
 */
public class EncapsulationExample {
    public static void main(String[] args) {
        House myHouse = new House();

        // The fields of the House class are only available through
        // the getter and setter methods. You can try to reach them
        // directly, but it is not possible
        // myHouse.size; <- this is not working

        myHouse.setAddress("Random address 123."); // <- but this is
        System.out.println(myHouse.getAddress()); // <- and this too.
    }
}
