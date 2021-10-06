package epam.education.prog2.collections.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * TODO docme.
 */
public class BasicsMain {

    public static void main(String[] args) {
        // You can use iterable as type but then you can only access
        // methods of an iterable (iterator())
        Iterable<Integer> gradeIterable = new ArrayList<>();
        gradeIterable.iterator();

        // You can use collection as type. This is a better approach
        // beacause the collections interface holds all the necessary
        // methods for a collection.
        Collection<Integer> gradeCollection = new ArrayList<>();
        gradeCollection.add(1);
        System.out.println(gradeCollection.contains(1));
        gradeCollection.clear();
        System.out.println(gradeCollection.isEmpty());
        // etc.

        // However most of the time, you will see declarations like this:
        List<Integer> gradeList = new ArrayList<>();
        // As you can see in all of the examples above, we have to
        // specify the type of objects we would like to store in the collection
        // We have to specify the type between <>. We will learn more about these on the next
        // lesson.

        // Methods:
        gradeList.add(1); // add element
        gradeList.addAll(Arrays.asList(1,2,3,4,5)); // Adds a collection of elements.
        printCollection(gradeList);

        System.out.println(gradeList.contains(3)); // Checks if the collection contains an element
        gradeList.remove(0); // Removes element on the given index
        printCollection(gradeList);
        gradeList.clear(); // Removes every element from the collection
        System.out.println(gradeList.isEmpty()); // Checks if a collection is empty.
        // etc.
    }

    private static void printCollection(Collection<Integer> c) {
        for(Integer i: c) {
            System.out.println(i);
        }
    }
}
