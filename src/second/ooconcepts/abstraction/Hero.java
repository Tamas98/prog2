package second.ooconcepts.abstraction;

/**
 * TODO docme.
 */
public abstract class Hero {

    private String name;
    private int strength;

    public Hero(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public abstract void train(int strengthGained);
}
