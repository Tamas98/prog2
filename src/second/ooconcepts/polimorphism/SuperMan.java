package second.ooconcepts.polimorphism;

/**
 * TODO docme.
 */
public class SuperMan extends Superhero {

    private final String ability;

    public SuperMan() {
        this.ability = "laser eyes";
    }

    public SuperMan(String ability) {
        this.ability = ability;
    }

    @Override
    public void useAbility() {
        System.out.println(String.format("Superman used his %s", this.ability));
    }

    @Override
    public void useAbility(int times) {
        System.out.println(String.format("Used %s %d times", this.ability, times));
    }
}
