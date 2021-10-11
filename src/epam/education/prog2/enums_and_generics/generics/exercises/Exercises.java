package epam.education.prog2.enums_and_generics.generics.exercises;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * TODO docme.
 */
public class Exercises {

    public <T extends Collection<?>> int count(T collection) {
        Iterator it = collection.iterator();
        int count = 0;
        while(it.hasNext()) {
            System.out.println(it.next().toString());
            count++;
        }
        return count;
    }

    public <T extends List<? extends Number>> void searchMax(T coll, int from, int to) {
        int max = 0;
        for(int i = from; i <= to; i++) {
            if(max < coll.get(i).intValue()) {
                max = coll.get(i).intValue();
            }
           // max = max < coll.get(i).intValue() ? coll.get(i).intValue() : max;
        }

        System.out.println(max);
    }
}
