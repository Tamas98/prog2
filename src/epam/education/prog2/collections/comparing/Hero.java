package epam.education.prog2.collections.comparing;

/**
 * TODO docme.
 */
public class Hero implements Comparable<Hero> {

    private String name;
    private int powerLevel;

    public Hero(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    @Override
    public int compareTo(Hero o) {
        return o.powerLevel-this.powerLevel;
    }
}
