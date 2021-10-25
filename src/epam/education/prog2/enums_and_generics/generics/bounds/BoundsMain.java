package epam.education.prog2.enums_and_generics.generics.bounds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import epam.education.prog2.enums_and_generics.generics.generic_class.Hero;

/**
 * TODO docme.
 */
public class BoundsMain {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        Hero hero = new Hero("Name","Nickname","Civilian",12);
        List<Hero> heroList = Arrays.asList(hero,hero,hero,hero,hero,hero,hero);

        BoundsExample boundsExample = new BoundsExample();
        boundsExample.switchPrint(numberList,heroList);

        List<Number> objectList = new ArrayList<>();
        boundsExample.copyNumberCollection(numberList, objectList);
        boundsExample.switchPrint(numberList, objectList);
    }
}
