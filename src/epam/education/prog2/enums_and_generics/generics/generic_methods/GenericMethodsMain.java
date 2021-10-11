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
        genericService.printGenericsClass("Hello");
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Double> doubleSet = new ArrayList<>(Arrays.asList(1.0,2.0,30.23,10.24));
        genericService.printLists(numberList, doubleSet);
        System.out.println(genericService.addNumbers(1, 12));
    }
}
