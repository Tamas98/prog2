package epam.education.prog2.enums_and_generics.generics.generic_methods;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * TODO docme.
 */
public class GenericService {

    public <T> void printVariableClass(T target) {
        String text = String.format("%s is the type of the given variable",target.getClass().getSimpleName());
        System.out.println(text);
    }
}
