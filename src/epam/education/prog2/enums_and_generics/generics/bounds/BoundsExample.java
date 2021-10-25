package epam.education.prog2.enums_and_generics.generics.bounds;

import java.util.List;
import java.util.Set;

/**
 * TODO docme.
 */
public class BoundsExample {

    public <T extends Number, U extends Number> float addition(T arg1, U arg2) {
        return arg1.floatValue() + arg2.floatValue();
    }

    // Unbounded wildcard
    public void switchPrint(List<?> listOne, List<?> listTwo) {
        int size = Math.max(listOne.size(), listTwo.size());
        for(int i = 0; i < size; i++) {
            System.out.print(listOne.size() <= i ? "" : listOne.get(i).toString());
            System.out.print("\t" + (listTwo.size() <= i ? "" : listTwo.get(i).toString()));
            System.out.println();
        }
    }

    public void copyNumberCollection(List<? extends Number> src, List<? super Number> dest) {
        dest.clear();
        dest.addAll(src);
    }
}
