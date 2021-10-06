package epam.education.prog2.collections.comparing;

import java.util.Comparator;

/**
 * TODO docme.
 */
public class HeroComparator implements Comparator<Hero> {
    @Override
    public int compare(Hero o1, Hero o2) {
        return o1.getPowerLevel() - o2.getPowerLevel();
    }
}
