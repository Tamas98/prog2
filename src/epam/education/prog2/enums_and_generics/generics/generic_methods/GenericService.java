package epam.education.prog2.enums_and_generics.generics.generic_methods;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * TODO docme.
 */
public class GenericService {

    public <T> void printGenericsClass(T target) {
        String text = String.format("%s is the type of the given variable",target.getClass().getSimpleName());
        System.out.println(text);
    }

    public <T extends List<? extends Number>,U extends List<? extends Number>> void printLists(T first, U second) {
        for(int i = 0; i < Math.max(first.size(), second.size()); i++) {
            System.out.println(first.size() <= i ? "-" : first.get(i));
            System.out.println(second.size() <= i  ? "-" : second.get(i));
        }
    }

    public <T extends Number, U extends Number> Integer addNumbers(T one, U two) {
        return one.intValue() + two.intValue();
    }
}
