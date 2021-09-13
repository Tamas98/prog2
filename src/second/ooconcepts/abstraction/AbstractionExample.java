package second.ooconcepts.abstraction;

/**
 * TODO docme.
 */
public class AbstractionExample {
    public static void main(String[] args) {
        //Hero hero = new Hero();
        IntergalacticHero hero = new IntergalacticHero("Silver surfer", 20, "Earth");
        System.out.println(hero.getName());
        System.out.println(hero.toString());
        hero.travelTo("Mars");
        hero.train(20);
        System.out.println(hero.toString());
    }
}
