package third.arrays;

/**
 * TODO docme.
 */
public class ArrayExamples {

    // intialize with ???
    int[] numArray = new int[5];

    Integer[] integerArray = new Integer[5];

    // initialize with numbers
    int[] numArray2 = new int[] {1,2,3,4,5};

    // initialize with numbers 2
    int[] numArray3 = {1,2,3,4,5};

    // multidimensional array
    int[][] numArrayMultiDim = {
            {1,2,3,4,5},
            {6,7,8,9,10}
    };

    public void printArray(int[] array) {
        for(int i: array) {
            System.out.println(i);
        }
    }

    public void printArray(Integer[] array) {
        for(Integer i: array) {
            System.out.println(i);
        }
    }

    // length property!!!
    public void printArray2(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void printArrayMultiDim(int[][] multiDimArray) {
        for(int[] array: multiDimArray) {
            for(int i: array) {
                System.out.println(i);
            }
        }
    }
}
