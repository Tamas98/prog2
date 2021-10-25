package epam.education.prog2.exceptionHandling.exercises;

import java.util.List;

/**
 * TODO docme.
 */
public class ExercisesMain {
    public static void main(String[] args) {
        String test = "1,2,3,4,5";
        System.out.println(adder(test));
    }

    public static int adder(String numString) {
        int sum = 0;
        String[] numList = numString.split(",");
        try {
            for(String s: numList) {
                sum += Integer.parseInt(s);
            }
            return sum;
        } catch (NumberFormatException e) {
            System.err.println("Error");
        }
        return 0;
    }
}
