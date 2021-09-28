package epam.education.prog2.basics.arrays;

/**
 * TODO docme.
 */
public class ArraysExample {

    public static void main(String[] args) {
        // Declaration
        int[] numbers1 = new int[5];
        int[] numbers2 = new int[] {1,2,3,4,5};
        int[] numbers3 = {1,2,3,4,5};
        int[][] multiDimNumbers = new int[2][2];
        int[][] multiDimNumbers2 = {
                {1,2,3,4,5},
                {1,2,3,4,5}
        };

        // Access elements
        System.out.println("\nAccess: ");
        System.out.println(numbers1[2]);
        System.out.println(numbers2[2]);
        System.out.println(numbers3[2]);

        System.out.println(multiDimNumbers[1][1]);
        System.out.println(multiDimNumbers2[1][2]);

        // Modify elements
        System.out.println("\nModification: ");
        System.out.println(numbers1[1]);
        numbers1[1] = 100;
        System.out.println(numbers1[1]);
        System.out.println(multiDimNumbers2[1][1]);
        multiDimNumbers2[1][1] = 100;
        System.out.println(multiDimNumbers2[1][1]);
    }
}
