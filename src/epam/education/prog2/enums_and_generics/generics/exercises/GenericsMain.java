package epam.education.prog2.enums_and_generics.generics.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * TODO docme.
 */
public class GenericsMain {
    public static void main(String[] args) {
        Car myCar = new Car("mycar", 12);
        Car myCar2 = new Car("mycar", 20);
        Car myCar3 = new Car("mycar", 50);

        Exercises exercises = new Exercises();
        System.out.println(exercises.count(Set.of(myCar, myCar2, myCar3)));

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,2141,551321,2341,1,4214);
        exercises.searchMax(numList, 0, 5);
    }
}
