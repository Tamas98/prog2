package second.ooconcepts.abstraction;

/**
 * TODO docme.
 */
public class IntergalacticHero extends Hero {

    private String planet;

    public IntergalacticHero(String name, int strength, String planet) {
        super(name, strength);
        this.planet = planet;
    }

    public void travelTo(String planet) {
        this.planet = planet;
    }

    @Override
    public String toString() {
        return "IntergalacticHero{" +
                "name='" + super.getName() + '\'' +
                "strength='" + super.getStrength() + '\'' +
                "planet='" + planet + '\'' +
                '}';
    }

    @Override
    public void train(int strengthGained) {
        super.setStrength(super.getStrength() + strengthGained);
    }
}
