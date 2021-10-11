package epam.education.prog2.enums_and_generics.generics.generic_class;

/**
 * TODO docme.
 */
public class GenericClassMain {
    public static void main(String[] args) {
        MyContainer<Hero> heroContainer = new MyContainer<>(Hero.class, 5);
        Hero spiderman = new Hero("Spider-Man","Spidey","Peter Parker", 70);
        Hero captainAmerica = new Hero("Captain America", "Cap", "Steve Rogers", 60);
        heroContainer.add(new Hero("asfas","fsafa","fsagaf",1));
        heroContainer.add(spiderman);
        System.out.println(heroContainer.elementCount());
        System.out.println(heroContainer);
        heroContainer.add(captainAmerica);
        heroContainer.add(spiderman);
        System.out.println(heroContainer.elementCount());
        System.out.println(heroContainer);
        heroContainer.delete(spiderman);
        System.out.println(heroContainer.elementCount());
        System.out.println(heroContainer);
        heroContainer.delete(spiderman);
        System.out.println(heroContainer.elementCount());
        System.out.println(heroContainer);
    }
}
