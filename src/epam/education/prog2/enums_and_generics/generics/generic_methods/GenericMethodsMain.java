package epam.education.prog2.enums_and_generics.generics.generic_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * TODO docme.
 */
public class GenericMethodsMain {
    public static void main(String[] args) {
        GenericService genericService = new GenericService();
        genericService.printVariableClass("Hello");
        genericService.printVariableClass(5);
        genericService.printVariableClass(new Object());

    }
}
