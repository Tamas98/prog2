package epam.education.prog2.collections.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * TODO docme.
 */
public class ComparingExample {
    public static void main(String[] args) {
        Hero superman = new Hero("Superman", 100);
        Hero batman = new Hero("Batman", 75);
        Hero flash = new Hero("Flash", 60);
        Hero myHero = new Hero("Stronger", 120);
        // As you can see below you can pass a collection to the constructor of the
        // collection to have initial values in the collection.
        List<Hero> heroList = new ArrayList<>(Arrays.asList(superman, batman, flash, myHero));
        printHeroes(heroList); // It is in the order of addition.
        Collections.sort(heroList); // Because we implemented the comparable interface, we can
        // just pass our hero collection to the Collections class sort method and it will do the work for us.
        System.out.println();
        printHeroes(heroList);
        Collections.sort(heroList, new HeroComparator()); // We can sort our collections with a comparator too
        // by passing it to the Collections sort method. It will sort in reverse order.
        System.out.println();
        printHeroes(heroList);

    }

    private static void printHeroes(Collection<Hero> c) {
        int placement = 1;
        for(Hero h: c) {
            System.out.println(String.format("%d. %s", placement, h.getName()));
            placement++;
        }
    }
}
